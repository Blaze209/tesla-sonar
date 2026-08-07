package com.fourthline.orca.internal;

import android.net.Uri;
import java.io.File;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AD implements InterfaceC4109zD {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24916b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24917c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f24918a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AD(File fourthlineDirectory) {
        p013kotlin.jvm.internal.s.k(fourthlineDirectory, "fourthlineDirectory");
        this.f24918a = fourthlineDirectory;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4109zD
    public Uri a(Un key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Uri uri = Uri.parse(BD.a(key, this.f24918a));
        p013kotlin.jvm.internal.s.j(uri, "parse(...)");
        return uri;
    }
}
