package androidx.work;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0002\f\u000fBI\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/work/t0;", "", "", "Ljava/util/UUID;", "ids", "", "uniqueWorkNames", "tags", "Landroidx/work/r0$c;", "states", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", DateTokenConverter.CONVERTER_KEY, "c", "e", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<UUID> ids;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> uniqueWorkNames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> tags;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<r0.c> states;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/work/t0$a;", "", "<init>", "()V", "", "Ljava/util/UUID;", "ids", "a", "(Ljava/util/List;)Landroidx/work/t0$a;", "", "uniqueWorkNames", DateTokenConverter.CONVERTER_KEY, "tags", "c", "Landroidx/work/r0$c;", "states", "b", "Landroidx/work/t0;", "e", "()Landroidx/work/t0;", "", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<UUID> ids;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> uniqueWorkNames;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> tags;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<r0.c> states;

        /* JADX INFO: renamed from: androidx.work.t0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/t0$a$a;", "", "<init>", "()V", "", "Ljava/util/UUID;", "ids", "Landroidx/work/t0$a;", "a", "(Ljava/util/List;)Landroidx/work/t0$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @SuppressLint({"BuilderSetStyle"})
            public final a a(List<UUID> ids) {
                p013kotlin.jvm.internal.s.k(ids, "ids");
                a aVar = new a(null);
                aVar.a(ids);
                return aVar;
            }

            private Companion() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final a f(List<UUID> list) {
            return INSTANCE.a(list);
        }

        public final a a(List<UUID> ids) {
            p013kotlin.jvm.internal.s.k(ids, "ids");
            p013kotlin.collections.v.E(this.ids, ids);
            return this;
        }

        public final a b(List<? extends r0.c> states) {
            p013kotlin.jvm.internal.s.k(states, "states");
            p013kotlin.collections.v.E(this.states, states);
            return this;
        }

        public final a c(List<String> tags) {
            p013kotlin.jvm.internal.s.k(tags, "tags");
            p013kotlin.collections.v.E(this.tags, tags);
            return this;
        }

        public final a d(List<String> uniqueWorkNames) {
            p013kotlin.jvm.internal.s.k(uniqueWorkNames, "uniqueWorkNames");
            p013kotlin.collections.v.E(this.uniqueWorkNames, uniqueWorkNames);
            return this;
        }

        public final t0 e() {
            if (this.ids.isEmpty() && this.uniqueWorkNames.isEmpty() && this.tags.isEmpty() && this.states.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new t0(this.ids, this.uniqueWorkNames, this.tags, this.states);
        }

        private a() {
            this.ids = new ArrayList();
            this.uniqueWorkNames = new ArrayList();
            this.tags = new ArrayList();
            this.states = new ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(List<UUID> ids, List<String> uniqueWorkNames, List<String> tags, List<? extends r0.c> states) {
        p013kotlin.jvm.internal.s.k(ids, "ids");
        p013kotlin.jvm.internal.s.k(uniqueWorkNames, "uniqueWorkNames");
        p013kotlin.jvm.internal.s.k(tags, "tags");
        p013kotlin.jvm.internal.s.k(states, "states");
        this.ids = ids;
        this.uniqueWorkNames = uniqueWorkNames;
        this.tags = tags;
        this.states = states;
    }

    public final List<UUID> a() {
        return this.ids;
    }

    public final List<r0.c> b() {
        return this.states;
    }

    public final List<String> c() {
        return this.tags;
    }

    public final List<String> d() {
        return this.uniqueWorkNames;
    }
}
