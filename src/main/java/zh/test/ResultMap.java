package zh.test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.google.common.util.concurrent.ListenableFuture;


public class ResultMap {
	private static ConcurrentHashMap<String, ListenableFuture> res = new ConcurrentHashMap<String, ListenableFuture>();

	public static void register(String hashCode, ListenableFuture fs) {
		res.put(hashCode, fs);
	}

	public static ConcurrentHashMap<String, ListenableFuture> getMap(){
		return res;
	}
	
	public static Object get(String hashCode) {
		try {
			ListenableFuture fs = res.get(hashCode);
			if (fs.isDone()) {
				res.remove(hashCode);
				return fs.get();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void remove(String hashCode) {
		res.remove(hashCode);
	}
}
