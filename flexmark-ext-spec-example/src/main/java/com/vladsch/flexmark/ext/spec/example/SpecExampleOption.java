package com.vladsch.flexmark.ext.spec.example;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/**
 * A SpecExample block node
 */
public class SpecExampleOption extends Node {
    @Override
    public void getAstExtra(StringBuilder out) {
        astExtraChars(out);
    }

    @Override
    public BasedSequence[] getSegments() {
        return EMPTY_SEGMENTS;
    }

    public SpecExampleOption() {
    }

    public SpecExampleOption(BasedSequence chars) {
        super(chars);
    }
}
