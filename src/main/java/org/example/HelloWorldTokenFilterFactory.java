package org.example;

import org.apache.lucene.analysis.TokenStream;
import org.elasticsearch.plugin.NamedComponent;
import org.elasticsearch.plugin.analysis.TokenFilterFactory;

@NamedComponent(value = "hello_world")
public class HelloWorldTokenFilterFactory implements TokenFilterFactory {

    @Override
    public TokenStream create(TokenStream tokenStream) {
        return new HelloWorldTokenFilter(tokenStream);
    }

}
