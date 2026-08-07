package com.tesla.oapi;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okio.c0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tesla/oapi/OwnerApiEndpoints;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "endpoints", "", "", "Lcom/tesla/oapi/OwnerApiEndpoint;", "getEndpoint", "name", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OwnerApiEndpoints {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static OwnerApiEndpoints instance;
    private Map<String, OwnerApiEndpoint> endpoints;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tesla/oapi/OwnerApiEndpoints$Companion;", "", "<init>", "()V", "instance", "Lcom/tesla/oapi/OwnerApiEndpoints;", "getInstance", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OwnerApiEndpoints getInstance(Context context) {
            s.k(context, "context");
            if (OwnerApiEndpoints.instance == null) {
                Context applicationContext = context.getApplicationContext();
                s.j(applicationContext, "getApplicationContext(...)");
                OwnerApiEndpoints.instance = new OwnerApiEndpoints(applicationContext, null);
            }
            OwnerApiEndpoints ownerApiEndpoints = OwnerApiEndpoints.instance;
            s.h(ownerApiEndpoints);
            return ownerApiEndpoints;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OwnerApiEndpoints(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final OwnerApiEndpoints getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public final OwnerApiEndpoint getEndpoint(String name) {
        s.k(name, "name");
        return this.endpoints.get(name);
    }

    private OwnerApiEndpoints(Context context) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open("shared/ownerapi_endpoints.json");
        s.j(inputStreamOpen, "open(...)");
        Map<String, OwnerApiEndpoint> map = (Map) new u.b().a(new w20.b()).d().d(y.j(Map.class, String.class, OwnerApiEndpoint.class)).fromJson(c0.d(c0.m(inputStreamOpen)));
        this.endpoints = map == null ? v0.i() : map;
    }
}
