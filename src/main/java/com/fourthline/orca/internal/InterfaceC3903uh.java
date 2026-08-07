package com.fourthline.orca.internal;

import java.io.File;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3903uh {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.uh$a */
    public static final class a implements InterfaceC3903uh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f35908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EnumC3689ph.b f35909b;

        public a(File file, EnumC3689ph.b type) {
            p013kotlin.jvm.internal.s.k(file, "file");
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f35908a = file;
            this.f35909b = type;
        }

        public final File a() {
            return this.f35908a;
        }

        public final EnumC3689ph.b b() {
            return this.f35909b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f35908a, aVar.f35908a) && this.f35909b == aVar.f35909b;
        }

        public int hashCode() {
            return (this.f35908a.hashCode() * 31) + this.f35909b.hashCode();
        }

        public String toString() {
            return "FromLocalFile(file=" + this.f35908a + ", type=" + this.f35909b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.uh$b */
    public static final class b implements InterfaceC3903uh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f35910a;

        public b(int i11) {
            this.f35910a = i11;
        }

        public final int a() {
            return this.f35910a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f35910a == ((b) obj).f35910a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f35910a);
        }

        public String toString() {
            return "FromRawResources(res=" + this.f35910a + ")";
        }
    }
}
