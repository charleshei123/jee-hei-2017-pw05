package hei.tp05.web;

import hei.tp05.core.config.AppConfig;
import hei.tp05.core.config.DBConfig;
import hei.tp05.web.config.WSConfig;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override public void onStartup(final ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        final ServletRegistration.Dynamic cxfServlet = servletContext.addServlet("cxfServlet", CXFServlet.class);
        cxfServlet.addMapping("/services/*");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ AppConfig.class, DBConfig.class,WSConfig.class};
    }


    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{};
    }


    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
