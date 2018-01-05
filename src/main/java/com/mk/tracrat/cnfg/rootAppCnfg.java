package com.mk.tracrat.cnfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {persistanceCnfg.class,Service.class})
public class rootAppCnfg {

}
