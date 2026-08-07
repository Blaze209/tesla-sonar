package io.ktor.utils.io.jvm.javaio;

import java.io.InputStream;
import jn0.m;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/g;", "Lkotlinx/coroutines/Job;", "parent", "Ljava/io/InputStream;", "c", "(Lio/ktor/utils/io/g;Lkotlinx/coroutines/Job;)Ljava/io/InputStream;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "b", "()Lorg/slf4j/Logger;", "ADAPTER_LOGGER", "", "Ljava/lang/Object;", "CloseToken", "FlushToken", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f78804a = m.b(a.f78807c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f78805b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f78806c = new Object();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Logger> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f78807c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Logger invoke() {
            return LoggerFactory.getLogger((Class<?>) io.ktor.utils.io.jvm.javaio.a.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger b() {
        return (Logger) f78804a.getValue();
    }

    public static final InputStream c(io.ktor.utils.io.g gVar, Job job) {
        s.k(gVar, "<this>");
        return new d(job, gVar);
    }

    public static /* synthetic */ InputStream d(io.ktor.utils.io.g gVar, Job job, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            job = null;
        }
        return c(gVar, job);
    }
}
