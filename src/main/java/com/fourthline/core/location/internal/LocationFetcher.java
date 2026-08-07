package com.fourthline.core.location.internal;

import com.fourthline.core.location.Coordinate;
import java.lang.ref.SoftReference;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J=\u0010\t\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/location/internal/LocationFetcher;", "", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Lcom/fourthline/core/location/Coordinate;", "Ljn0/h0;", "success", "", "failure", "start", "(Ljava/lang/ref/SoftReference;Lwn0/l;)V", "stop", "()V", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "location", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocationFetcher {
    Coordinate getLocation();

    void start(SoftReference<l<Coordinate, h0>> success, l<? super Throwable, h0> failure);

    void stop();
}
