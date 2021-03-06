package core.security;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 26/12/2015 10:59 AM
 * |
 **/

import play.filters.gzip.GzipFilter;
import play.http.HttpFilters;
import play.api.mvc.EssentialFilter;
import play.filters.csrf.CSRFFilter;
import javax.inject.Inject;

public class Filters implements HttpFilters {

    @Inject CSRFFilter csrfFilter;

    @Inject
    GzipFilter gzipFilter;

    @Override
    public EssentialFilter[] filters() {
        return new EssentialFilter[] { csrfFilter, gzipFilter };
    }

}
