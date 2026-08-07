package com.fourthline.orca.internal;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3954vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36275b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36276a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vo$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3954vo a(AssetManager from) throws IOException {
            p013kotlin.jvm.internal.s.k(from, "from");
            DefaultConstructorMarker defaultConstructorMarker = null;
            try {
                InputStream inputStreamOpen = from.open("orca_configuration.json");
                p013kotlin.jvm.internal.s.j(inputStreamOpen, "open(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked);
                try {
                    String strF = sn0.r.f(bufferedReader);
                    sn0.b.a(bufferedReader, null);
                    return new C3954vo(new JSONObject(strF).getBoolean("skipPersonalDetails"));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (FileNotFoundException unused) {
                return new C3954vo(false, 1, defaultConstructorMarker);
            }
        }

        private a() {
        }
    }

    public C3954vo(boolean z11) {
        this.f36276a = z11;
    }

    public final boolean a() {
        return this.f36276a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3954vo) && this.f36276a == ((C3954vo) obj).f36276a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f36276a);
    }

    public String toString() {
        return "OrcaConfiguration(skipPersonalDetails=" + this.f36276a + ")";
    }

    public /* synthetic */ C3954vo(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
