package fast.cloud.nacos.feign.openapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * COPYRIGHT © 2005-2018 CHARLESKEITH ALL RIGHTS RESERVED.
 *
 * @author Batman.qin
 * @create 2018-11-23 19:36
 */
@Api("SchedualServiceHi")
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    Logger logger = LoggerFactory.getLogger(SchedualServiceHi.class);

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ApiOperation(value = "sayHiFromClientOne", notes = "sayHiFromClientOne")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
