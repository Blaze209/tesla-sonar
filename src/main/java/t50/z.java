package t50;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.p003lifecycle.s0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lt50/z;", "Lt50/w;", "Lt50/z$a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "Lv50/g;", "message", "heading", "Ljn0/h0;", "e", "(Lv50/g;Lv50/g;)V", "a", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class z extends w<State> {

    /* JADX INFO: renamed from: t50.z$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lt50/z$a;", "Landroid/os/Parcelable;", "Lv50/g;", "message", "heading", "<init>", "(Lv50/g;Lv50/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lv50/g;", "b", "()Lv50/g;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C2406a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.g message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.g heading;

        /* JADX INFO: renamed from: t50.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C2406a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final State createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new State((v50.g) parcel.readParcelable(State.class.getClassLoader()), (v50.g) parcel.readParcelable(State.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final State[] newArray(int i11) {
                return new State[i11];
            }
        }

        public State(v50.g gVar, v50.g gVar2) {
            this.message = gVar;
            this.heading = gVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final v50.g getHeading() {
            return this.heading;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final v50.g getMessage() {
            return this.message;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return p013kotlin.jvm.internal.s.f(this.message, state.message) && p013kotlin.jvm.internal.s.f(this.heading, state.heading);
        }

        public int hashCode() {
            v50.g gVar = this.message;
            int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            v50.g gVar2 = this.heading;
            return iHashCode + (gVar2 != null ? gVar2.hashCode() : 0);
        }

        public String toString() {
            return "State(message=" + this.message + ", heading=" + this.heading + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.message, flags);
            parcel.writeParcelable(this.heading, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s0 savedStateHandle) {
        super(savedStateHandle);
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
    }

    public static /* synthetic */ void f(z zVar, v50.g gVar, v50.g gVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            gVar2 = null;
        }
        zVar.e(gVar, gVar2);
    }

    public final void e(v50.g message, v50.g heading) {
        d(new State(message, heading));
    }
}
