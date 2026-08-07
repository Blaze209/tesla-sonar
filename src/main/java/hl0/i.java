package hl0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lhl0/i;", "", "<init>", "()V", "a", "b", "c", "Lhl0/i$a;", "Lhl0/i$b;", "Lhl0/i$c;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lhl0/i$a;", "Lhl0/i;", "Lhl0/h;", "relativeTo", "<init>", "(Lhl0/h;)V", "a", "Lhl0/h;", "()Lhl0/h;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Phase relativeTo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Phase relativeTo) {
            super(null);
            s.k(relativeTo, "relativeTo");
            this.relativeTo = relativeTo;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Phase getRelativeTo() {
            return this.relativeTo;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhl0/i$b;", "Lhl0/i;", "Lhl0/h;", "relativeTo", "<init>", "(Lhl0/h;)V", "a", "Lhl0/h;", "getRelativeTo", "()Lhl0/h;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Phase relativeTo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Phase relativeTo) {
            super(null);
            s.k(relativeTo, "relativeTo");
            this.relativeTo = relativeTo;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl0/i$c;", "Lhl0/i;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f73152a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i() {
    }
}
