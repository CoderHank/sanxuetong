package com.desd.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;

/**
 * Created by Hank on 2015/4/14.
 */

public final class Json {

    private static final ObjectMapper mapper = new ObjectMapper();

    private Json() {

    }

    /**
     * to json
     * @param obj
     * @return
     * @throws java.io.IOException
     */
    public static String toJson(Object obj) throws IOException {
        return mapper.writeValueAsString(obj);
    }

    /**
     * parse json as Object
     * @param json
     * @param clazz
     * @return
     * @throws java.io.IOException
     */
    public static <T> T parse(String json, Class<T> clazz) throws IOException {
        return mapper.readValue(json, clazz);
    }

    /**
     * parse json use TypeReference
     * @param json
     * @param typeRef
     * @return
     * @throws java.io.IOException
     */
    public static <T> T parse(String json, TypeReference<T> typeRef) throws IOException {
        return mapper.readValue(json, typeRef);
    }

    /**
     * parse json as array
     * @param json
     * @param typeRef
     * @return
     * @throws java.io.IOException
     * @deprecated use parse
     */
    public static <T> T parseArray(String json, TypeReference<T> typeRef) throws IOException {
        return parse(json, typeRef);
    }

}