package com.sabu.springbatch.config;

import com.sabu.springbatch.customerreport.Customer;
import com.sabu.springbatch.customerreport.CustomerItemReader;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/27
 */
@Configuration
public class CustomerReportJobConfig {
//
//    @Autowired
//    private JobBuilderFactory jobBuilders;
//
//    @Autowired
//    private StepBuilderFactory stepBuilders;
//
//    @Bean
//    public Job customerReportJob() {
//        return jobBuilders.get("customerReportJob")
//                .start(taskletStep())
//                .next(chunkStep())
//                .build();
//    }
//
//    @Bean
//    public Step taskletStep() {
//        return stepBuilders.get("taskletStep")
//                .tasklet(tasklet())
//                .build();
//    }
//
//    @Bean
//    public Tasklet tasklet() {
//        return (contribution, chunkContext) -> {
//            return RepeatStatus.FINISHED;
//        };
//    }
//
//    @Bean
//    public Step chunkStep() {
//        return stepBuilders.get("chunkStep")
//                .<Customer, Customer>chunk(20)
//                .reader(reader())
//                .processor(processor())
//                .writer(writer())
//                .build();
//    }
//
//    @StepScope
//    @Bean
//    public ItemReader<Customer> reader() {
//        return new CustomerItemReader(XML_FILE);
//    }

}
