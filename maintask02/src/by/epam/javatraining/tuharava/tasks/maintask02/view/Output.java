
package by.epam.javatraining.tuharava.tasks.maintask02.view;

import org.apache.log4j.Logger;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class Output {
    
    private static final Logger LOG = Logger.getRootLogger();
    
    public static void log (String str) {
        LOG.trace(str);
        LOG.debug(str);
        LOG.info(str);
        LOG.warn(str);
        LOG.error(str);
        LOG.fatal(str);
    } 
    
}
