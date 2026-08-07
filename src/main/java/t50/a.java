package t50;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.p003lifecycle.s0;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import h50.NoticeSheetState;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lt50/a;", "Lt50/w;", "Lt50/a$a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "Lh50/b$a$d;", StatusResponse.PAYLOAD, "Ljn0/h0;", "e", "(Lh50/b$a$d;)V", "a", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends w<State> {

    /* JADX INFO: renamed from: t50.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lt50/a$a;", "Landroid/os/Parcelable;", "Lh50/b$a$d;", StatusResponse.PAYLOAD, "<init>", "(Lh50/b$a$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lh50/b$a$d;", "()Lh50/b$a$d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C2402a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final NoticeSheetState.a.UpdateRequired payload;

        /* JADX INFO: renamed from: t50.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C2402a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final State createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new State(NoticeSheetState.a.UpdateRequired.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final State[] newArray(int i11) {
                return new State[i11];
            }
        }

        public State(NoticeSheetState.a.UpdateRequired payload) {
            p013kotlin.jvm.internal.s.k(payload, "payload");
            this.payload = payload;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NoticeSheetState.a.UpdateRequired getPayload() {
            return this.payload;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && p013kotlin.jvm.internal.s.f(this.payload, ((State) other).payload);
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "State(payload=" + this.payload + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.payload.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s0 savedStateHandle) {
        super(savedStateHandle);
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
    }

    public final void e(NoticeSheetState.a.UpdateRequired payload) {
        p013kotlin.jvm.internal.s.k(payload, "payload");
        d(new State(payload));
    }
}
