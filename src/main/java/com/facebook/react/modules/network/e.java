package com.facebook.react.modules.network;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/react/modules/network/e;", "", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.react.modules.network.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/modules/network/e$a;", "", "<init>", "()V", "", "name", "a", "(Ljava/lang/String;)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String name) {
            s.k(name, "name");
            StringBuilder sb2 = new StringBuilder(name.length());
            int length = name.length();
            boolean z11 = false;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = name.charAt(i11);
                if (s.m(cCharAt, 32) <= 0 || s.m(cCharAt, 127) >= 0) {
                    z11 = true;
                } else {
                    sb2.append(cCharAt);
                }
            }
            if (!z11) {
                return name;
            }
            String string = sb2.toString();
            s.j(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }

    public static final String a(String str) {
        return INSTANCE.a(str);
    }
}
