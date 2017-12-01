
package org.folio.rest.client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpClientResponse;
import org.folio.rest.tools.utils.VertxUtils;


/**
 * Auto-generated code - based on class org.folio.rest.jaxrs.resource.JobsResource
 * 
 */
public class JobsClient {

    private final static String GLOBAL_PATH = "/jobs";
    private String tenantId;
    private String token;
    private HttpClientOptions options;
    private HttpClient httpClient;

    public JobsClient(String host, int port, String tenantId, String token, boolean keepAlive, int connTO, int idleTO) {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        this.tenantId = tenantId;
        this.token = token;
        options = new HttpClientOptions();
        options.setLogActivity(true);
        options.setKeepAlive(keepAlive);
        options.setDefaultHost(host);
        options.setDefaultPort(port);
        options.setConnectTimeout(connTO);
        options.setIdleTimeout(idleTO);
        httpClient = VertxUtils.getVertxFromContextOrNew().createHttpClient(options);
    }

    public JobsClient(String host, int port, String tenantId, String token) {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        this(host, port, tenantId, token, true, 2000, 5000);
    }

    public JobsClient(String host, int port, String tenantId, String token, boolean keepAlive) {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        this(host, port, tenantId, token, keepAlive, 2000, 5000);
    }

    /**
     * Convenience constructor for tests ONLY!<br>Connect to localhost on 8081 as folio_demo tenant.
     * 
     */
    public JobsClient() {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        this("localhost", 8081, "folio_demo", "folio_demo", false, 2000, 5000);
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+""+queryParams.toString()
     * 
     */
    public void deleteJobId(String jobId, String jobconfsId, String lang, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.delete("/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+""+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Accept", "text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+""+queryParams.toString()
     * 
     */
    public void putJobId(String jobId, String jobconfsId, String lang, org.folio.rest.jaxrs.model.Job Job, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException, Exception
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        Buffer buffer = Buffer.buffer();
        if (Job!= null) {
            buffer.appendString(org.folio.rest.tools.ClientHelpers.pojo2json(Job));
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.put("/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+""+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Content-type", "application/json");
        request.putHeader("Accept", "text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.putHeader("Content-Length", buffer.length()+"");
        request.setChunked(true);
        request.write(buffer);
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+"/bulks"+queryParams.toString()
     * 
     */
    public void postJobIdBulks(String jobId, String jobconfsId, String lang, org.folio.rest.jaxrs.model.Bulk Bulk, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException, Exception
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        Buffer buffer = Buffer.buffer();
        if (Bulk!= null) {
            buffer.appendString(org.folio.rest.tools.ClientHelpers.pojo2json(Bulk));
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.post("/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+"/bulks"+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Content-type", "application/json");
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.putHeader("Content-Length", buffer.length()+"");
        request.setChunked(true);
        request.write(buffer);
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+"/bulks"+queryParams.toString()
     * 
     */
    public void getJobIdBulks(String jobId, String jobconfsId, String lang, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.get("/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+"/bulks"+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+""+queryParams.toString()
     * 
     */
    public void getJobId(String jobId, String jobconfsId, String lang, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.get("/jobs/jobconfs/"+jobconfsId+"/jobs/"+jobId+""+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+""+queryParams.toString()
     * 
     */
    public void deleteJobconfsId(String jobconfsId, String lang, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.delete("/jobs/jobconfs/"+jobconfsId+""+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Accept", "text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+""+queryParams.toString()
     * 
     */
    public void putJobconfsId(String jobconfsId, String lang, org.folio.rest.jaxrs.model.JobConf JobConf, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException, Exception
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        Buffer buffer = Buffer.buffer();
        if (JobConf!= null) {
            buffer.appendString(org.folio.rest.tools.ClientHelpers.pojo2json(JobConf));
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.put("/jobs/jobconfs/"+jobconfsId+""+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Content-type", "application/json");
        request.putHeader("Accept", "text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.putHeader("Content-Length", buffer.length()+"");
        request.setChunked(true);
        request.write(buffer);
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+"/jobs"+queryParams.toString()
     * 
     */
    public void getJobconfsIdJobs(String jobconfsId, String query, String orderBy, org.folio.rest.jaxrs.resource.JobsResource.Order order, int offset, int limit, String lang, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (query!= null) {
            queryParams.append("query=");
            queryParams.append(URLEncoder.encode(query, "UTF-8"));
            queryParams.append("&");
        }
        if (orderBy!= null) {
            queryParams.append("orderBy=");
            queryParams.append(URLEncoder.encode(orderBy, "UTF-8"));
            queryParams.append("&");
        }
        if (order!= null) {
            queryParams.append("order=");
            queryParams.append(order);
            queryParams.append("&");
        }
        queryParams.append("offset=");
        queryParams.append(offset);
        queryParams.append("&");
        queryParams.append("limit=");
        queryParams.append(limit);
        queryParams.append("&");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.get("/jobs/jobconfs/"+jobconfsId+"/jobs"+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+"/jobs"+queryParams.toString()
     * 
     */
    public void postJobconfsIdJobs(String jobconfsId, String lang, org.folio.rest.jaxrs.model.Job Job, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException, Exception
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        Buffer buffer = Buffer.buffer();
        if (Job!= null) {
            buffer.appendString(org.folio.rest.tools.ClientHelpers.pojo2json(Job));
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.post("/jobs/jobconfs/"+jobconfsId+"/jobs"+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Content-type", "application/json");
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.putHeader("Content-Length", buffer.length()+"");
        request.setChunked(true);
        request.write(buffer);
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs/"+jobconfsId+""+queryParams.toString()
     * 
     */
    public void getJobconfsId(String jobconfsId, String lang, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.get("/jobs/jobconfs/"+jobconfsId+""+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs"+queryParams.toString()
     * 
     */
    public void getJobconfs(String query, String orderBy, org.folio.rest.jaxrs.resource.JobsResource.Order order, int offset, int limit, String lang, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (query!= null) {
            queryParams.append("query=");
            queryParams.append(URLEncoder.encode(query, "UTF-8"));
            queryParams.append("&");
        }
        if (orderBy!= null) {
            queryParams.append("orderBy=");
            queryParams.append(URLEncoder.encode(orderBy, "UTF-8"));
            queryParams.append("&");
        }
        if (order!= null) {
            queryParams.append("order=");
            queryParams.append(order);
            queryParams.append("&");
        }
        queryParams.append("offset=");
        queryParams.append(offset);
        queryParams.append("&");
        queryParams.append("limit=");
        queryParams.append(limit);
        queryParams.append("&");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.get("/jobs/jobconfs"+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.end();
    }

    /**
     * Service endpoint "/jobs/jobconfs"+queryParams.toString()
     * 
     */
    public void postJobconfs(String lang, org.folio.rest.jaxrs.model.JobConf JobConf, Handler<HttpClientResponse> responseHandler)
        throws UnsupportedEncodingException, Exception
    {
        // Auto-generated code
        // - generated by       org.folio.rest.tools.ClientGenerator
        // - generated based on org.folio.rest.jaxrs.resource.JobsResource
        StringBuilder queryParams = new StringBuilder("?");
        if (lang!= null) {
            queryParams.append("lang=");
            queryParams.append(URLEncoder.encode(lang, "UTF-8"));
            queryParams.append("&");
        }
        Buffer buffer = Buffer.buffer();
        if (JobConf!= null) {
            buffer.appendString(org.folio.rest.tools.ClientHelpers.pojo2json(JobConf));
        }
        io.vertx.core.http.HttpClientRequest request = httpClient.post("/jobs/jobconfs"+queryParams.toString());
        request.handler(responseHandler);
        request.putHeader("Content-type", "application/json");
        request.putHeader("Accept", "application/json,text/plain");
        if (tenantId!= null) {
            request.putHeader("X-Okapi-Token", token);
            request.putHeader("x-okapi-tenant", tenantId);
        }
        request.putHeader("Content-Length", buffer.length()+"");
        request.setChunked(true);
        request.write(buffer);
        request.end();
    }

}
