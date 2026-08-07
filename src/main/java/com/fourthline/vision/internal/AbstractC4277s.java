package com.fourthline.vision.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4277s extends Throwable {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s$a */
    public static final class a extends AbstractC4277s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38819a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ a copy$default(a aVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f38819a;
            }
            return aVar.copy(str);
        }

        public final String component1() {
            return this.f38819a;
        }

        public final a copy(String str) {
            return new a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f38819a, ((a) obj).f38819a);
        }

        public final String getMsg() {
            return this.f38819a;
        }

        public int hashCode() {
            String str = this.f38819a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "CameraOpenException(msg=" + this.f38819a + ")";
        }

        public a(String str) {
            super(str, null);
            this.f38819a = str;
        }

        public /* synthetic */ a(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s$b */
    public static final class b extends AbstractC4277s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38820a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ b copy$default(b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f38820a;
            }
            return bVar.copy(str);
        }

        public final String component1() {
            return this.f38820a;
        }

        public final b copy(String str) {
            return new b(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f38820a, ((b) obj).f38820a);
        }

        public final String getMsg() {
            return this.f38820a;
        }

        public int hashCode() {
            String str = this.f38820a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "CameraSessionConfigureException(msg=" + this.f38820a + ")";
        }

        public b(String str) {
            super(str, null);
            this.f38820a = str;
        }

        public /* synthetic */ b(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s$c */
    public static final class c extends AbstractC4277s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f38821a = new c();

        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s$d */
    public static final class d extends AbstractC4277s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f38822a = new d();

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s$e */
    public static final class e extends AbstractC4277s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f38823a = new e();

        /* JADX WARN: Multi-variable type inference failed */
        private e() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ AbstractC4277s(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AbstractC4277s(String str) {
        super(str);
    }

    public /* synthetic */ AbstractC4277s(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, null);
    }
}
