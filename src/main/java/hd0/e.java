package hd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.h;
import com.squareup.moshi.u;
import com.tesla.messagebuilder.util.GeneratedJsonAdapter;
import com.tesla.messagebuilder.util.RemoteBuildingRequestBody;
import com.tesla.messagebuilder.util.RemoteBuildingResponse;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lhd0/e;", "", "<init>", "()V", "Lcom/squareup/moshi/u;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Lcom/squareup/moshi/u;", "moshi", "Lcom/squareup/moshi/h;", "Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "c", "e", "()Lcom/squareup/moshi/h;", "requestBodyJsonAdapter", "Lcom/tesla/messagebuilder/util/RemoteBuildingResponse;", "f", "responseJsonAdapter", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f72561a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy moshi = m.b(new wn0.a() { // from class: hd0.b
        @Override // wn0.a
        public final Object invoke() {
            return e.g();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy requestBodyJsonAdapter = m.b(new wn0.a() { // from class: hd0.c
        @Override // wn0.a
        public final Object invoke() {
            return e.h();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Lazy responseJsonAdapter = m.b(new wn0.a() { // from class: hd0.d
        @Override // wn0.a
        public final Object invoke() {
            return e.i();
        }
    });

    private e() {
    }

    private final u d() {
        return (u) moshi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u g() {
        return new u.b().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GeneratedJsonAdapter h() {
        u uVarD = f72561a.d();
        s.j(uVarD, "<get-moshi>(...)");
        return new GeneratedJsonAdapter(uVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.tesla.messagebuilder.util.GeneratedJsonAdapter i() {
        u uVarD = f72561a.d();
        s.j(uVarD, "<get-moshi>(...)");
        return new com.tesla.messagebuilder.util.GeneratedJsonAdapter(uVarD);
    }

    public final h<RemoteBuildingRequestBody> e() {
        return (h) requestBodyJsonAdapter.getValue();
    }

    public final h<RemoteBuildingResponse> f() {
        return (h) responseJsonAdapter.getValue();
    }
}
