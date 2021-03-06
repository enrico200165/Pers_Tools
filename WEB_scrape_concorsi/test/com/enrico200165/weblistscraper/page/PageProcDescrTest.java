package com.enrico200165.weblistscraper.page;

import com.enrico200165.weblistscraper.concorsi_it.configs.*;
import com.enrico200165.weblistscraper.configs.*;
import com.enrico200165.weblistscraper.tools.*;
import org.apache.log4j.*;
import org.junit.*;

/**
 * Created by enrico on 2/14/2016.
 */
public class PageProcDescrTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetRelUri() throws Exception {

        HostConfig hc = new HostConfig("V:\\data\\pers_dev\\data_dbs\\web_scraper\\host_conncorsi_it.properties");

        PageProcDescr ppd = new PageProcDescr(hc,null,null,"http://google.com", WebPageAction.GET);


    }


    @Test
    public void testGetUri() throws Exception {
        HostConfig hc = new HostConfig("V:\\data\\pers_dev\\data_dbs\\web_scraper\\host_conncorsi_it.properties");

        PageProcDescr ppd = new PageProcDescr(hc,null,null,"http://google.com/pippo?nome=enrico", WebPageAction.GET);
        ppd.getUri();

        log.info(ppd.getUri().getScheme()+"://"+ppd.getUri().getHost()+ppd.getUri().getPath()+"?"+ppd.getUri().getQuery());
        //log.info(ret);
        //assertTrue("/".equals(ppd.getRelUri()));

    }



    @Test
    public void testSetRelUri() throws Exception {

    }

    @Test
    public void testGetAction() throws Exception {

    }

    @Test
    public void testSetAction() throws Exception {

    }

    @Test
    public void testSetUri() throws Exception {

    }

    private static org.apache.log4j.Logger log = Logger.getLogger(PageProcDescrTest.class);

}