package com.cookingBird.subject.common.processor;


public interface ChainProcessor<Arg, R> {

    R process(Arg payload, R pre)
            ;
}
