package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import java.util.ArrayList;
import java.util.List;
import oi0.e0;
import oi0.n5;
import oi0.v;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b-\u0010,R*\u00106\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103R&\u0010>\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u00105\u001a\u0004\b;\u0010<R(\u0010D\u001a\u00020?8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010@\u0012\u0004\bC\u00105\u001a\u0004\b&\u0010A\"\u0004\b9\u0010B¨\u0006E"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Loi0/n5;", "Loi0/d;", "Loi0/v;", "Loi0/e0;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)V", "Landroid/graphics/Bitmap;", "newValue", "f", "(Landroid/graphics/Bitmap;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Bitmap;", "getValue", "()Landroid/graphics/Bitmap;", "setValue", "(Landroid/graphics/Bitmap;)V", "getValue$annotations", "()V", "value", "", "Lxi0/a;", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "associatedViews", "Lpi0/b;", "Lpi0/b;", "()Lpi0/b;", "(Lpi0/b;)V", "getBitmapController$annotations", "bitmapController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ESignatureComponent implements n5, oi0.d<ESignatureComponent>, v, e0 {
    public static final Parcelable.Creator<ESignatureComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bitmap value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private pi0.b bitmapController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ESignatureComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ESignatureComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ESignatureComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(ESignatureComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ESignatureComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ESignatureComponent[] newArray(int i11) {
            return new ESignatureComponent[i11];
        }
    }

    public ESignatureComponent(String name, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        s.k(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.bitmapController = new pi0.b(null);
    }

    public static /* synthetic */ ESignatureComponent d(ESignatureComponent eSignatureComponent, String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = eSignatureComponent.name;
        }
        if ((i11 & 2) != 0) {
            jsonLogicBoolean = eSignatureComponent.hidden;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean2 = eSignatureComponent.disabled;
        }
        return eSignatureComponent.c(str, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getBitmapController$annotations() {
    }

    @Override // oi0.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public pi0.b getBitmapController() {
        return this.bitmapController;
    }

    public final ESignatureComponent c(String name, JsonLogicBoolean hidden, JsonLogicBoolean disabled) {
        s.k(name, "name");
        return new ESignatureComponent(name, hidden, disabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public void e(pi0.b bVar) {
        s.k(bVar, "<set-?>");
        this.bitmapController = bVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESignatureComponent)) {
            return false;
        }
        ESignatureComponent eSignatureComponent = (ESignatureComponent) other;
        return s.f(this.name, eSignatureComponent.name) && s.f(this.hidden, eSignatureComponent.hidden) && s.f(this.disabled, eSignatureComponent.disabled);
    }

    @Override // oi0.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ESignatureComponent b(Bitmap newValue) {
        ESignatureComponent eSignatureComponentD = d(this, null, null, null, 7, null);
        eSignatureComponentD.value = newValue;
        eSignatureComponentD.e(getBitmapController());
        return eSignatureComponentD;
    }

    @Override // oi0.v
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // oi0.e0
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    @Override // oi0.e0
    public List<xi0.a> h() {
        return this.associatedViews;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public String toString() {
        return "ESignatureComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ESignatureComponent(ESignature config) {
        s.k(config, "config");
        String name = config.getName();
        ESignature.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        ESignature.Attributes attributes2 = config.getAttributes();
        this(name, hidden, attributes2 != null ? attributes2.getDisabled() : null);
    }
}
