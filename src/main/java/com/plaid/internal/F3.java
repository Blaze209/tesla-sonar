package com.plaid.internal;

import android.content.res.Resources;
import com.plaid.link.R;
import com.plaid.link.result.LinkErrorCode;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f46311a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46312a;

        static {
            int[] iArr = new int[H3.values().length];
            try {
                iArr[H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f46312a = iArr;
        }
    }

    public F3(Resources resources) {
        p013kotlin.jvm.internal.s.k(resources, "resources");
        this.f46311a = resources;
    }

    public final N2.i a() {
        m8.CREATOR.getClass();
        p013kotlin.jvm.internal.s.k("unknown", "workflowId");
        m8 m8Var = new m8("unknown", "error_pane_id", "local_error_pane");
        H3 h11 = H3.INITIALIZATION_ERROR;
        return new N2.i("unknown", m8Var, "", a(h11), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), p013kotlin.collections.v.m(), "", h11);
    }

    public final String a(H3 h11) {
        int i11 = a.f46312a[h11.ordinal()];
        if (i11 == 1) {
            String string = this.f46311a.getString(R.string.plaid_error_no_network_connection_content);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            return string;
        }
        if (i11 == 2) {
            String string2 = this.f46311a.getString(R.string.plaid_error_session_expired_content);
            p013kotlin.jvm.internal.s.j(string2, "getString(...)");
            return string2;
        }
        if (i11 == 3) {
            String string3 = this.f46311a.getString(R.string.plaid_error_initialization_content);
            p013kotlin.jvm.internal.s.j(string3, "getString(...)");
            return string3;
        }
        if (i11 == 4) {
            String string4 = this.f46311a.getString(R.string.plaid_error_internal_server_error_try_again_later);
            p013kotlin.jvm.internal.s.j(string4, "getString(...)");
            return string4;
        }
        if (i11 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = this.f46311a.getString(R.string.plaid_error_fallback_content);
        p013kotlin.jvm.internal.s.j(string5, "getString(...)");
        return string5;
    }
}
