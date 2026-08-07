package com.github.barteksc.pdfviewer.exception;

/* JADX INFO: loaded from: classes4.dex */
public class PageRenderingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39288a;

    public PageRenderingException(int i11, Throwable th2) {
        super(th2);
        this.f39288a = i11;
    }

    public int a() {
        return this.f39288a;
    }
}
