
package zh.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Component
public class ThreadPoolConfig {
    ExecutorService executorService = Executors.newFixedThreadPool(30);
    ExecutorService accept = Executors.newFixedThreadPool(30);
    
    //分发线程池
    ExecutorService boss =  Executors.newFixedThreadPool(30);
    //处理线程池1
    ListeningExecutorService lprocess1 = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(20));
    //处理线程池2
    ListeningExecutorService lprocess2 = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(20));
    //处理线程池3
    ListeningExecutorService lprocess3 = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(20));
    
    
    
    
    @Bean(name = "accept")
    public ExecutorService getAccept(){
        return accept;
    }
    @Bean(name = "boss")
    public ExecutorService getBoss(){
        return boss;
    }
    
    @Bean(name = "process1")
    public ListeningExecutorService getlProcess1(){
        return lprocess1;
    }
    @Bean(name = "process2")
    public ListeningExecutorService getlProcess2(){
        return lprocess2;
    }
    @Bean(name = "process3")
    public ListeningExecutorService getlProcess3(){
        return lprocess3;
    }
    
}
