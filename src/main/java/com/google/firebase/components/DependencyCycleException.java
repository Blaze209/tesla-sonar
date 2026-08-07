package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import yu.c;

/* JADX INFO: loaded from: classes5.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c<?>> f43869a;

    public DependencyCycleException(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f43869a = list;
    }
}
