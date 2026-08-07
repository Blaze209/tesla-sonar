package p011ja;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p003lifecycle.Lifecycle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010(\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'¨\u0006-"}, d2 = {"Lja/l;", "Landroid/os/Parcelable;", "Lja/k;", "entry", "<init>", "(Lja/k;)V", "Landroid/os/Parcel;", "inParcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lja/r;", "destination", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Lja/o;", "viewModel", "b", "(Landroid/content/Context;Lja/r;Landroidx/lifecycle/Lifecycle$State;Lja/o;)Lja/k;", "", "describeContents", "()I", "parcel", IntegerTokenConverter.CONVERTER_KEY, "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "I", "destinationId", "Landroid/os/Bundle;", "c", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", DateTokenConverter.CONVERTER_KEY, "getSavedState", "savedState", "e", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bundle args;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;
    public static final Parcelable.Creator<l> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ja/l$a", "Landroid/os/Parcelable$Creator;", "Lja/l;", "Landroid/os/Parcel;", "inParcel", "a", "(Landroid/os/Parcel;)Lja/l;", "", "size", "", "b", "(I)[Lja/l;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel inParcel) {
            s.k(inParcel, "inParcel");
            return new l(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int size) {
            return new l[size];
        }
    }

    public l(k entry) {
        s.k(entry, "entry");
        this.id = entry.getId();
        this.destinationId = entry.getDestination().getId();
        this.args = entry.c();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.j(bundle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    public final k b(Context context, r destination, Lifecycle.State hostLifecycleState, o viewModel) {
        s.k(context, "context");
        s.k(destination, "destination");
        s.k(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return k.INSTANCE.a(context, destination, bundle, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.k(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public l(Parcel inParcel) {
        s.k(inParcel, "inParcel");
        String string = inParcel.readString();
        s.h(string);
        this.id = string;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(l.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(l.class.getClassLoader());
        s.h(bundle);
        this.savedState = bundle;
    }
}
