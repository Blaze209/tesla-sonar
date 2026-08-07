package com.fourthline.vision.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4255o4 extends Throwable {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$a */
    public static class a extends AbstractC4255o4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC4241m4 f38688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC4241m4 error, String str) {
            super(str, null);
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f38688a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!p013kotlin.jvm.internal.s.f(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type com.fourthline.vision.internal.scanner.ScannerException.Error");
            return this.f38688a == ((a) obj).f38688a;
        }

        public final EnumC4241m4 getError() {
            return this.f38688a;
        }

        public int hashCode() {
            return this.f38688a.hashCode();
        }

        public /* synthetic */ a(EnumC4241m4 enumC4241m4, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC4241m4, (i11 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$b */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f38689b = new b();

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            super(EnumC4241m4.RECOGNITION_MODELS_NOT_DOWNLOADED, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$c */
    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f38690b = new c();

        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(EnumC4241m4.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$d */
    public static final class d extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f38691b = new d();

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super(EnumC4241m4.TIMEOUT, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$e */
    public static final class e extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f38692b = new e();

        /* JADX WARN: Multi-variable type inference failed */
        private e() {
            super(EnumC4241m4.SCANNER_INTERRUPTED, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$f */
    public static abstract class f extends AbstractC4255o4 {

        /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$f$a */
        public static final class a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f38693a = new a();

            /* JADX WARN: Multi-variable type inference failed */
            private a() {
                super(null, 0 == true ? 1 : 0);
            }
        }

        public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private f(String str) {
            super(str, null);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$g */
    public static final class g extends AbstractC4255o4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f38694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f38695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<? extends Enum<?>> warnings, String str) {
            super(str, null);
            p013kotlin.jvm.internal.s.k(warnings, "warnings");
            this.f38694a = warnings;
            this.f38695b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ g copy$default(g gVar, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = gVar.f38694a;
            }
            if ((i11 & 2) != 0) {
                str = gVar.f38695b;
            }
            return gVar.copy(list, str);
        }

        public final List<Enum<?>> component1() {
            return this.f38694a;
        }

        public final String component2() {
            return this.f38695b;
        }

        public final g copy(List<? extends Enum<?>> warnings, String str) {
            p013kotlin.jvm.internal.s.k(warnings, "warnings");
            return new g(warnings, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p013kotlin.jvm.internal.s.f(this.f38694a, gVar.f38694a) && p013kotlin.jvm.internal.s.f(this.f38695b, gVar.f38695b);
        }

        public final String getMsg() {
            return this.f38695b;
        }

        public final List<Enum<?>> getWarnings() {
            return this.f38694a;
        }

        public int hashCode() {
            int iHashCode = this.f38694a.hashCode() * 31;
            String str = this.f38695b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Warning(warnings=" + this.f38694a + ", msg=" + this.f38695b + ")";
        }

        public /* synthetic */ g(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o4$h */
    public static final class h extends AbstractC4255o4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f38696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Throwable throwable) {
            super(throwable.getMessage(), null);
            p013kotlin.jvm.internal.s.k(throwable, "throwable");
            this.f38696a = throwable;
        }

        public static /* synthetic */ h copy$default(h hVar, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = hVar.f38696a;
            }
            return hVar.copy(th2);
        }

        public final Throwable component1() {
            return this.f38696a;
        }

        public final h copy(Throwable throwable) {
            p013kotlin.jvm.internal.s.k(throwable, "throwable");
            return new h(throwable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && p013kotlin.jvm.internal.s.f(this.f38696a, ((h) obj).f38696a);
        }

        public final Throwable getThrowable() {
            return this.f38696a;
        }

        public int hashCode() {
            return this.f38696a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Wrapper(throwable=" + this.f38696a + ")";
        }
    }

    public /* synthetic */ AbstractC4255o4(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AbstractC4255o4(String str) {
        super(str);
    }
}
