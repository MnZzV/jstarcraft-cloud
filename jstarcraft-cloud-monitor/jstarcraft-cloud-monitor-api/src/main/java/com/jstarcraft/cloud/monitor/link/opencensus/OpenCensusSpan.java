package com.jstarcraft.cloud.monitor.link.opencensus;

import java.time.Instant;

import com.jstarcraft.cloud.monitor.link.LinkContext;
import com.jstarcraft.cloud.monitor.link.LinkSpan;
import com.jstarcraft.core.common.lifecycle.LifecycleState;

import io.opencensus.trace.Span;

public class OpenCensusSpan implements LinkSpan, AutoCloseable {

    private String name;

    private String parent;

    private Span span;

    public OpenCensusSpan(String name, String parent, Span span) {
        this.name = name;
        this.parent = parent;
        this.span = span;
    }

    @Override
    public String getRoot() {
        return span.getContext().getTraceId().toLowerBase16();
    }

    @Override
    public String getParent() {
        // TODO Auto-generated method stub
        return parent;
    }

    @Override
    public String getId() {
        return span.getContext().getSpanId().toLowerBase16();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public Instant getBegin() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Instant getEnd() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LifecycleState getState() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LinkContext getContext() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub

    }

}
