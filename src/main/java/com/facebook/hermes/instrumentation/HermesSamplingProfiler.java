package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0006\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;", "", "<init>", "()V", "Ljn0/h0;", "enable", "disable", "", "filename", "dumpSampledTraceToFile", "(Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HermesSamplingProfiler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HermesSamplingProfiler f21580a = new HermesSamplingProfiler();

    static {
        SoLoader.t("jsijniprofiler");
    }

    private HermesSamplingProfiler() {
    }

    public static final native void disable();

    public static final native void dumpSampledTraceToFile(String filename);

    public static final native void enable();
}
