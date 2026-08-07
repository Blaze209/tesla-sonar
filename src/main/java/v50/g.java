package v50;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lv50/g;", "Landroid/os/Parcelable;", "", "i2", "(Lr2/l;I)Ljava/lang/CharSequence;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lv50/g$b;", "Lv50/g$c;", "Lv50/g$d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface g extends Parcelable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static CharSequence a(g gVar, l lVar, int i11) {
            CharSequence quantityText;
            lVar.H(2059343640);
            if (o.J()) {
                o.S(2059343640, i11, -1, "com.stripe.android.financialconnections.ui.TextResource.toText (TextResource.kt:38)");
            }
            if (gVar instanceof Text) {
                lVar.H(-1250499307);
                lVar.T();
                quantityText = ((Text) gVar).getValue();
            } else {
                int i12 = 0;
                if (gVar instanceof StringId) {
                    lVar.H(-1250489019);
                    StringId stringId = (StringId) gVar;
                    List<String> listA = stringId.a();
                    quantityText = ((Context) lVar.U(AndroidCompositionLocals_androidKt.g())).getResources().getText(stringId.getValue());
                    for (Object obj : listA) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            v.x();
                        }
                        quantityText = TextUtils.replace(quantityText, new String[]{"%" + i13 + "$s"}, new String[]{(String) obj});
                        i12 = i13;
                    }
                    s.j(quantityText, "foldIndexed(...)");
                    lVar.T();
                } else {
                    if (!(gVar instanceof PluralId)) {
                        lVar.H(-1250537456);
                        lVar.T();
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar.H(-1250471723);
                    PluralId pluralId = (PluralId) gVar;
                    List<String> listA2 = pluralId.a();
                    quantityText = ((Context) lVar.U(AndroidCompositionLocals_androidKt.g())).getResources().getQuantityText(pluralId.getValue(), pluralId.getCount());
                    for (Object obj2 : listA2) {
                        int i14 = i12 + 1;
                        if (i12 < 0) {
                            v.x();
                        }
                        quantityText = TextUtils.replace(quantityText, new String[]{"%" + i14 + "$s"}, new String[]{(String) obj2});
                        i12 = i14;
                    }
                    s.j(quantityText, "foldIndexed(...)");
                    lVar.T();
                }
            }
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return quantityText;
        }
    }

    /* JADX INFO: renamed from: v50.g$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv50/g$d;", "Lv50/g;", "", "value", "<init>", "(Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Text implements g {
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CharSequence value;

        /* JADX INFO: renamed from: v50.g$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Text> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Text createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Text((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Text[] newArray(int i11) {
                return new Text[i11];
            }
        }

        public Text(CharSequence value) {
            s.k(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CharSequence getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && s.f(this.value, ((Text) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // v50.g
        public CharSequence i2(l lVar, int i11) {
            return a.a(this, lVar, i11);
        }

        public String toString() {
            return "Text(value=" + ((Object) this.value) + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            TextUtils.writeToParcel(this.value, parcel, flags);
        }
    }

    CharSequence i2(l lVar, int i11);

    /* JADX INFO: renamed from: v50.g$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lv50/g$c;", "Lv50/g;", "", "value", "", "", "args", "<init>", "(ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StringId implements g {
        public static final Parcelable.Creator<StringId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> args;

        /* JADX INFO: renamed from: v50.g$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StringId> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StringId createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new StringId(parcel.readInt(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StringId[] newArray(int i11) {
                return new StringId[i11];
            }
        }

        public StringId(int i11, List<String> args) {
            s.k(args, "args");
            this.value = i11;
            this.args = args;
        }

        public final List<String> a() {
            return this.args;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringId)) {
                return false;
            }
            StringId stringId = (StringId) other;
            return this.value == stringId.value && s.f(this.args, stringId.args);
        }

        public int hashCode() {
            return (Integer.hashCode(this.value) * 31) + this.args.hashCode();
        }

        @Override // v50.g
        public CharSequence i2(l lVar, int i11) {
            return a.a(this, lVar, i11);
        }

        public String toString() {
            return "StringId(value=" + this.value + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(this.value);
            parcel.writeStringList(this.args);
        }

        public /* synthetic */ StringId(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? v.m() : list);
        }
    }

    /* JADX INFO: renamed from: v50.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lv50/g$b;", "Lv50/g;", "", "value", "count", "", "", "args", "<init>", "(IILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PluralId implements g {
        public static final Parcelable.Creator<PluralId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int count;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> args;

        /* JADX INFO: renamed from: v50.g$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PluralId> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PluralId createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new PluralId(parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PluralId[] newArray(int i11) {
                return new PluralId[i11];
            }
        }

        public PluralId(int i11, int i12, List<String> args) {
            s.k(args, "args");
            this.value = i11;
            this.count = i12;
            this.args = args;
        }

        public final List<String> a() {
            return this.args;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PluralId)) {
                return false;
            }
            PluralId pluralId = (PluralId) other;
            return this.value == pluralId.value && this.count == pluralId.count && s.f(this.args, pluralId.args);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.value) * 31) + Integer.hashCode(this.count)) * 31) + this.args.hashCode();
        }

        @Override // v50.g
        public CharSequence i2(l lVar, int i11) {
            return a.a(this, lVar, i11);
        }

        public String toString() {
            return "PluralId(value=" + this.value + ", count=" + this.count + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(this.value);
            parcel.writeInt(this.count);
            parcel.writeStringList(this.args);
        }

        public /* synthetic */ PluralId(int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, i12, (i13 & 4) != 0 ? v.m() : list);
        }
    }
}
