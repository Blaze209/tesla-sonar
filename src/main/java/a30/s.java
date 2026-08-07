package a30;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;
import y20.Snapshot;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/os/Parcelable;", "Ly20/i;", "a", "(Landroid/os/Parcelable;)Ly20/i;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokio/i;", "bufferedSink", "Ljn0/h0;", "a", "(Lokio/i;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<okio.i, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Parcelable f221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Parcelable parcelable) {
            super(1);
            this.f221c = parcelable;
        }

        public final void a(okio.i bufferedSink) {
            p013kotlin.jvm.internal.s.k(bufferedSink, "bufferedSink");
            Parcel parcelObtain = Parcel.obtain();
            p013kotlin.jvm.internal.s.j(parcelObtain, "obtain()");
            parcelObtain.writeParcelable(this.f221c, 0);
            byte[] byteArray = parcelObtain.marshall();
            p013kotlin.jvm.internal.s.j(byteArray, "byteArray");
            bufferedSink.write(byteArray);
            parcelObtain.recycle();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(okio.i iVar) {
            a(iVar);
            return jn0.h0.f84049a;
        }
    }

    public static final Snapshot a(Parcelable parcelable) {
        p013kotlin.jvm.internal.s.k(parcelable, "<this>");
        return Snapshot.INSTANCE.c(new a(parcelable));
    }
}
