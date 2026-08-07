package ei0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\t\u0007\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lei0/i;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "stepName", "f", "g", DateTokenConverter.CONVERTER_KEY, "b", "e", "c", "Lei0/i$a;", "Lei0/i$b;", "Lei0/i$c;", "Lei0/i$d;", "Lei0/i$e;", "Lei0/i$f;", "Lei0/i$g;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lei0/i$a;", "Lei0/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String stepName) {
            super(null);
            s.k(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // ei0.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && s.f(this.stepName, ((a) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // ei0.i
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-registration";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lei0/i$b;", "Lei0/i;", "", "stepName", "Lei0/b;", "subPage", "<init>", "(Ljava/lang/String;Lei0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lei0/b;", "getSubPage", "()Lei0/b;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ei0.b subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String stepName, ei0.b subPage) {
            super(null);
            s.k(stepName, "stepName");
            s.k(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // ei0.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return s.f(this.stepName, bVar.stepName) && s.f(this.subPage, bVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // ei0.i
        public String toString() {
            String str;
            ei0.b bVar = this.subPage;
            if (s.f(bVar, ei0.b.a.f62969a)) {
                str = "pending";
            } else if (s.f(bVar, ei0.b.C1292b.f62970a)) {
                str = "prompt";
            } else if (s.f(bVar, ei0.b.c.f62971a)) {
                str = "review";
            } else {
                if (!s.f(bVar, ei0.b.d.f62972a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "capture";
            }
            return super.toString() + "/documents/" + str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lei0/i$c;", "Lei0/i;", "", "stepName", "Lei0/h;", "subPage", "<init>", "(Ljava/lang/String;Lei0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lei0/h;", "getSubPage", "()Lei0/h;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final h subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String stepName, h subPage) {
            super(null);
            s.k(stepName, "stepName");
            s.k(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // ei0.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return s.f(this.stepName, cVar.stepName) && s.f(this.subPage, cVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // ei0.i
        public String toString() {
            String str;
            h hVar = this.subPage;
            if (s.f(hVar, h.a.f62982a)) {
                str = "autoclassification-failure";
            } else if (s.f(hVar, h.b.f62983a)) {
                str = "autoclassification-select";
            } else if (s.f(hVar, h.g.f62988a)) {
                str = "select";
            } else if (s.f(hVar, h.e.f62986a)) {
                str = "pending";
            } else if (hVar instanceof h.Check) {
                str = ((h.Check) this.subPage).getPageIndex() + "/check";
            } else if (hVar instanceof h.CheckUpload) {
                str = ((h.CheckUpload) this.subPage).getPageIndex() + "/check-upload";
            } else if (hVar instanceof h.Prompt) {
                str = ((h.Prompt) this.subPage).getPageIndex() + "/prompt";
            } else {
                if (!(hVar instanceof h.TakePhoto)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((h.TakePhoto) this.subPage).getPageIndex() + "/capture";
            }
            return super.toString() + "/government-id/" + str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lei0/i$d;", "Lei0/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String stepName) {
            super(null);
            s.k(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // ei0.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && s.f(this.stepName, ((d) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // ei0.i
        public String toString() {
            return super.toString() + "/scan-nfc";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lei0/i$e;", "Lei0/i;", "", "stepName", "Lei0/j;", "subPage", "<init>", "(Ljava/lang/String;Lei0/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lei0/j;", "getSubPage", "()Lei0/j;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final j subPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String stepName, j subPage) {
            super(null);
            s.k(stepName, "stepName");
            s.k(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // ei0.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return s.f(this.stepName, eVar.stepName) && s.f(this.subPage, eVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // ei0.i
        public String toString() {
            String str;
            j jVar = this.subPage;
            if (s.f(jVar, j.b.f63001a)) {
                str = "finalize-video";
            } else if (s.f(jVar, j.d.f63003a)) {
                str = "pending";
            } else if (s.f(jVar, j.e.f63004a)) {
                str = "prompt";
            } else if (jVar instanceof j.LeadInAnimation) {
                str = ((j.LeadInAnimation) this.subPage).getPose() + "/capture-lead-in-animation";
            } else if (jVar instanceof j.TakePhoto) {
                str = ((j.TakePhoto) this.subPage).getPose() + "/capture";
            } else {
                if (!s.f(jVar, j.a.f63000a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "check-upload";
            }
            return super.toString() + "/selfie/" + str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lei0/i$f;", "Lei0/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class f extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String stepName) {
            super(null);
            s.k(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // ei0.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && s.f(this.stepName, ((f) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // ei0.i
        public String toString() {
            return super.toString() + "/ui";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lei0/i$g;", "Lei0/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class g extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String stepName) {
            super(null);
            s.k(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // ei0.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && s.f(this.stepName, ((g) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // ei0.i
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-authentication";
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getStepName();

    public String toString() {
        return "/inquiry";
    }

    private i() {
    }
}
