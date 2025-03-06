/**
 * Hello World Greet Helidon MP Application
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package group.client.api;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

@Provider
public class ApiExceptionMapper implements ResponseExceptionMapper<ApiException> {

    @Override
    public boolean handles(int status, MultivaluedMap<String, Object> headers) {
        return status >= 400;
    }

    @Override
    public ApiException toThrowable(Response response) {
        return new ApiException(response);
    }
}
