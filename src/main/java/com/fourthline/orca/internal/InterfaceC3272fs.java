package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.net.URI;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3272fs {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fs$a */
    public static final class a implements InterfaceC3272fs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final URI f31846a;

        public a(URI uri) {
            p013kotlin.jvm.internal.s.k(uri, "uri");
            this.f31846a = uri;
        }

        public final URI a() {
            return this.f31846a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f31846a, ((a) obj).f31846a);
        }

        public int hashCode() {
            return this.f31846a.hashCode();
        }

        public String toString() {
            return "Document(uri=" + this.f31846a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fs$b */
    public static final class b implements InterfaceC3272fs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f31847a;

        public b(Bitmap bitmap) {
            p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
            this.f31847a = bitmap;
        }

        public final Bitmap a() {
            return this.f31847a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f31847a, ((b) obj).f31847a);
        }

        public int hashCode() {
            return this.f31847a.hashCode();
        }

        public String toString() {
            return "Image(bitmap=" + this.f31847a + ")";
        }
    }
}
