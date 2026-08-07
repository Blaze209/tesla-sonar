package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.t;
import a30.w;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oi0.Option;
import oi0.c2;
import oi0.e0;
import oi0.n5;
import oi0.v;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pi0.l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 x2\u00020\u00012\u00020\u00022\u00020\u0003:\u000368<B\u007f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010*J \u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b/\u0010*J\u001a\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b5\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010DR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bF\u0010H\u001a\u0004\bJ\u0010IR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b8\u0010LR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR&\u0010V\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bS\u0010K\u0012\u0004\bT\u0010U\u001a\u0004\bE\u0010LR(\u0010^\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bX\u0010Y\u0012\u0004\b]\u0010U\u001a\u0004\b<\u0010Z\"\u0004\b[\u0010\\R(\u0010b\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b_\u0010Y\u0012\u0004\ba\u0010U\u001a\u0004\bS\u0010Z\"\u0004\b`\u0010\\R:\u0010f\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010\u00112\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010K\u0012\u0004\be\u0010U\u001a\u0004\b:\u0010LR0\u0010k\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u0011\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b \u0010i\u0012\u0004\bj\u0010UR\u001d\u0010n\u001a\u00020\u001f8\u0006¢\u0006\u0012\n\u0004\b;\u0010l\u0012\u0004\bm\u0010U\u001a\u0004\b@\u0010!R(\u0010v\u001a\u00020o8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bu\u0010U\u001a\u0004\bp\u0010r\"\u0004\bs\u0010tR\u0019\u0010w\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bM\u0010L¨\u0006y"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;", "Loi0/n5;", "Loi0/v;", "Loi0/e0;", "", "name", "selectedCountry", "selectedIdType", "idValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "hideCountryField", "hideIdTypeField", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$IdType;", "allowedIdTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "inputSelectStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V", "Loi0/e4;", "x", "(Loi0/e4;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;", "y", "value", "z", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;", "Loi0/c2;", "q", "()Loi0/c2;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "v", "c", "w", DateTokenConverter.CONVERTER_KEY, "r", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "f", "getDisabled", "g", "Z", "()Z", "h", "j", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "k", "Ljava/util/List;", "()Ljava/util/List;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "u", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "", "Lxi0/a;", "m", "getAssociatedViews$annotations", "()V", "associatedViews", "Lpi0/l;", "n", "Lpi0/l;", "()Lpi0/l;", "setCountryOptionsController", "(Lpi0/l;)V", "getCountryOptionsController$annotations", "countryOptionsController", "o", "setIdTypeOptionsController", "getIdTypeOptionsController$annotations", "idTypeOptionsController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$c;", "p", "getCountryOptions$annotations", "countryOptions", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$e;", "Ljava/util/Map;", "getTypesByCountryCode$annotations", "typesByCountryCode", "Loi0/c2;", "getCountrySelectComponent$annotations", "countrySelectComponent", "La30/t;", "s", "La30/t;", "()La30/t;", "setIdValueController", "(La30/t;)V", "getIdValueController$annotations", "idValueController", "idTypeOptions", "t", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputInternationalDbComponent implements n5, v, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedIdType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hideCountryField;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hideIdTypeField;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hideCountryIfSingleChoice;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hideTypeIfSingleChoice;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<InputInternationalDb.IdType> allowedIdTypes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputSelectComponentStyle inputSelectStyle;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private l countryOptionsController;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private l idTypeOptionsController;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private List<CountryOption> countryOptions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Map<String, ? extends List<IdOption>> typesByCountryCode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final c2 countrySelectComponent;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private t idValueController;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputInternationalDbComponent> CREATOR = new d();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$a */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/b$a", "Loi0/c2;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "a", "()Z", "canSelectMultipleValues", "", "Loi0/e4;", "getOptions", "()Ljava/util/List;", "options", "", "getLabel", "()Ljava/lang/String;", AnnotatedPrivateKey.LABEL, "c", "selectedOptions", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements c2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<CountryOption> f58638b;

        a(Set<CountryOption> set) {
            this.f58638b = set;
        }

        @Override // oi0.c2
        /* JADX INFO: renamed from: a */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // oi0.c2
        public List<Option> c() {
            return p013kotlin.collections.v.m();
        }

        @Override // oi0.c2
        public String getLabel() {
            return null;
        }

        @Override // oi0.c2
        public List<Option> getOptions() {
            Set<CountryOption> set = this.f58638b;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(c.l((CountryOption) it.next()));
            }
            return arrayList;
        }

        @Override // oi0.c2
        public InputSelectBoxComponentStyle getStyles() {
            return InputInternationalDbComponent.this.getInputSelectStyle();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(((IdOption) t11).getName(), ((IdOption) t12).getName());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InputInternationalDbComponent a(InputInternationalDb config) {
            List<InputInternationalDb.IdType> allowedIdTypes;
            String countryName;
            String name;
            s.k(config, "config");
            InputInternationalDb.Attributes attributes = config.getAttributes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InputInternationalDb.Attributes attributes2 = config.getAttributes();
            if (attributes2 != null && (allowedIdTypes = attributes2.getAllowedIdTypes()) != null) {
                for (InputInternationalDb.IdType idType : allowedIdTypes) {
                    String countryCode = idType.getCountryCode();
                    if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                        linkedHashSet.add(new CountryOption(countryName, countryCode));
                        Object arrayList = linkedHashMap.get(countryCode);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(countryCode, arrayList);
                        }
                        Collection collection = (Collection) arrayList;
                        String idType2 = idType.getIdType();
                        if (idType2 != null && (name = idType.getName()) != null) {
                            collection.add(new IdOption(idType2, name));
                        }
                    }
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                if (list.size() > 1) {
                    p013kotlin.collections.v.C(list, new a());
                }
            }
            boolean z11 = (attributes != null ? s.f(attributes.getHideCountryIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbCountry() != null;
            boolean z12 = (attributes != null ? s.f(attributes.getHideTypeIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbType() != null;
            String name2 = config.getName();
            InputInternationalDb.Attributes attributes3 = config.getAttributes();
            String prefillIdbCountry = attributes3 != null ? attributes3.getPrefillIdbCountry() : null;
            InputInternationalDb.Attributes attributes4 = config.getAttributes();
            String prefillIdbType = attributes4 != null ? attributes4.getPrefillIdbType() : null;
            InputInternationalDb.Attributes attributes5 = config.getAttributes();
            String prefillIdbValue = attributes5 != null ? attributes5.getPrefillIdbValue() : null;
            InputInternationalDb.Attributes attributes6 = config.getAttributes();
            JsonLogicBoolean hidden = attributes6 != null ? attributes6.getHidden() : null;
            InputInternationalDb.Attributes attributes7 = config.getAttributes();
            JsonLogicBoolean disabled = attributes7 != null ? attributes7.getDisabled() : null;
            InputInternationalDb.Attributes attributes8 = config.getAttributes();
            Boolean hideCountryIfSingleChoice = attributes8 != null ? attributes8.getHideCountryIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes9 = config.getAttributes();
            Boolean hideTypeIfSingleChoice = attributes9 != null ? attributes9.getHideTypeIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes10 = config.getAttributes();
            List<InputInternationalDb.IdType> allowedIdTypes2 = attributes10 != null ? attributes10.getAllowedIdTypes() : null;
            InputInternationalDb.InputInternationalDbComponentStyle styles = config.getStyles();
            return new InputInternationalDbComponent(name2, prefillIdbCountry, prefillIdbType, prefillIdbValue, hidden, disabled, z11, z12, hideCountryIfSingleChoice, hideTypeIfSingleChoice, allowedIdTypes2, styles != null ? styles.getInputSelectStyle() : null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$c;", "", "", "countryName", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountryOption {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        public CountryOption(String countryName, String countryCode) {
            s.k(countryName, "countryName");
            s.k(countryCode, "countryCode");
            this.countryName = countryName;
            this.countryCode = countryCode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountryName() {
            return this.countryName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryOption)) {
                return false;
            }
            CountryOption countryOption = (CountryOption) other;
            return s.f(this.countryName, countryOption.countryName) && s.f(this.countryCode, countryOption.countryCode);
        }

        public int hashCode() {
            return (this.countryName.hashCode() * 31) + this.countryCode.hashCode();
        }

        public String toString() {
            return "CountryOption(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$d */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements Parcelable.Creator<InputInternationalDbComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputInternationalDbComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0 ? z12 : z11);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() == 0 ? z11 : true);
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new InputInternationalDbComponent(string, string2, string3, string4, jsonLogicBoolean, jsonLogicBoolean2, z11, z12, boolValueOf, boolValueOf2, arrayList, (InputSelectComponentStyle) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputInternationalDbComponent[] newArray(int i11) {
            return new InputInternationalDbComponent[i11];
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$e;", "", "", "idType", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IdOption {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String idType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        public IdOption(String idType, String name) {
            s.k(idType, "idType");
            s.k(name, "name");
            this.idType = idType;
            this.name = name;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIdType() {
            return this.idType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdOption)) {
                return false;
            }
            IdOption idOption = (IdOption) other;
            return s.f(this.idType, idOption.idType) && s.f(this.name, idOption.name);
        }

        public int hashCode() {
            return (this.idType.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "IdOption(idType=" + this.idType + ", name=" + this.name + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$f */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((IdOption) t11).getName(), ((IdOption) t12).getName());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$g */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/b$g", "Loi0/c2;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "a", "()Z", "canSelectMultipleValues", "", "Loi0/e4;", "getOptions", "()Ljava/util/List;", "options", "", "getLabel", "()Ljava/lang/String;", AnnotatedPrivateKey.LABEL, "c", "selectedOptions", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements c2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<IdOption> f58644b;

        g(List<IdOption> list) {
            this.f58644b = list;
        }

        @Override // oi0.c2
        /* JADX INFO: renamed from: a */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // oi0.c2
        public List<Option> c() {
            return p013kotlin.collections.v.m();
        }

        @Override // oi0.c2
        public String getLabel() {
            return null;
        }

        @Override // oi0.c2
        public List<Option> getOptions() {
            List<IdOption> list = this.f58644b;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c.m((IdOption) it.next()));
            }
            return arrayList;
        }

        @Override // oi0.c2
        public InputSelectBoxComponentStyle getStyles() {
            return InputInternationalDbComponent.this.getInputSelectStyle();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$h */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((CountryOption) t11).getCountryName(), ((CountryOption) t12).getCountryName());
        }
    }

    public InputInternationalDbComponent(String name, String str, String str2, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, boolean z11, boolean z12, Boolean bool, Boolean bool2, List<InputInternationalDb.IdType> list, InputSelectComponentStyle inputSelectComponentStyle) {
        Option optionM;
        Object next;
        Object next2;
        String countryName;
        String name2;
        s.k(name, "name");
        this.name = name;
        this.selectedCountry = str;
        this.selectedIdType = str2;
        this.idValue = str3;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.hideCountryField = z11;
        this.hideIdTypeField = z12;
        this.hideCountryIfSingleChoice = bool;
        this.hideTypeIfSingleChoice = bool2;
        this.allowedIdTypes = list;
        this.inputSelectStyle = inputSelectComponentStyle;
        this.associatedViews = new ArrayList();
        this.idValueController = w.a(str3 == null ? "" : str3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (InputInternationalDb.IdType idType : list) {
                String countryCode = idType.getCountryCode();
                if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                    linkedHashSet.add(new CountryOption(countryName, countryCode));
                    Object arrayList = linkedHashMap.get(countryCode);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(countryCode, arrayList);
                    }
                    Collection collection = (Collection) arrayList;
                    String idType2 = idType.getIdType();
                    if (idType2 != null && (name2 = idType.getName()) != null) {
                        collection.add(new IdOption(idType2, name2));
                    }
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            if (list2.size() > 1) {
                p013kotlin.collections.v.C(list2, new f());
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        do {
            optionM = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!s.f(((CountryOption) next).getCountryCode(), this.selectedCountry));
        CountryOption countryOption = (CountryOption) next;
        Option optionL = countryOption != null ? c.l(countryOption) : null;
        List list3 = (List) linkedHashMap.get(optionL != null ? optionL.getValue() : null);
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!s.f(((IdOption) next2).getIdType(), this.selectedIdType));
            IdOption idOption = (IdOption) next2;
            if (idOption != null) {
                optionM = c.m(idOption);
            }
        }
        this.countryOptionsController = new l(optionL);
        this.idTypeOptionsController = new l(optionM);
        this.countryOptions = p013kotlin.collections.v.a1(p013kotlin.collections.v.m1(linkedHashSet), new h());
        this.typesByCountryCode = linkedHashMap;
        this.countrySelectComponent = new a(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputInternationalDbComponent b(InputInternationalDbComponent inputInternationalDbComponent, String str, String str2, String str3, String str4, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, boolean z11, boolean z12, Boolean bool, Boolean bool2, List list, InputSelectComponentStyle inputSelectComponentStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputInternationalDbComponent.name;
        }
        if ((i11 & 2) != 0) {
            str2 = inputInternationalDbComponent.selectedCountry;
        }
        if ((i11 & 4) != 0) {
            str3 = inputInternationalDbComponent.selectedIdType;
        }
        if ((i11 & 8) != 0) {
            str4 = inputInternationalDbComponent.idValue;
        }
        if ((i11 & 16) != 0) {
            jsonLogicBoolean = inputInternationalDbComponent.hidden;
        }
        if ((i11 & 32) != 0) {
            jsonLogicBoolean2 = inputInternationalDbComponent.disabled;
        }
        if ((i11 & 64) != 0) {
            z11 = inputInternationalDbComponent.hideCountryField;
        }
        if ((i11 & 128) != 0) {
            z12 = inputInternationalDbComponent.hideIdTypeField;
        }
        if ((i11 & 256) != 0) {
            bool = inputInternationalDbComponent.hideCountryIfSingleChoice;
        }
        if ((i11 & 512) != 0) {
            bool2 = inputInternationalDbComponent.hideTypeIfSingleChoice;
        }
        if ((i11 & 1024) != 0) {
            list = inputInternationalDbComponent.allowedIdTypes;
        }
        if ((i11 & 2048) != 0) {
            inputSelectComponentStyle = inputInternationalDbComponent.inputSelectStyle;
        }
        List list2 = list;
        InputSelectComponentStyle inputSelectComponentStyle2 = inputSelectComponentStyle;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        boolean z13 = z11;
        boolean z14 = z12;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean2;
        return inputInternationalDbComponent.a(str, str2, str3, str4, jsonLogicBoolean3, jsonLogicBoolean4, z13, z14, bool3, bool4, list2, inputSelectComponentStyle2);
    }

    public final InputInternationalDbComponent a(String name, String selectedCountry, String selectedIdType, String idValue, JsonLogicBoolean hidden, JsonLogicBoolean disabled, boolean hideCountryField, boolean hideIdTypeField, Boolean hideCountryIfSingleChoice, Boolean hideTypeIfSingleChoice, List<InputInternationalDb.IdType> allowedIdTypes, InputSelectComponentStyle inputSelectStyle) {
        s.k(name, "name");
        return new InputInternationalDbComponent(name, selectedCountry, selectedIdType, idValue, hidden, disabled, hideCountryField, hideIdTypeField, hideCountryIfSingleChoice, hideTypeIfSingleChoice, allowedIdTypes, inputSelectStyle);
    }

    public final List<InputInternationalDb.IdType> c() {
        return this.allowedIdTypes;
    }

    public final List<CountryOption> d() {
        return this.countryOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getCountryOptionsController() {
        return this.countryOptionsController;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputInternationalDbComponent)) {
            return false;
        }
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) other;
        return s.f(this.name, inputInternationalDbComponent.name) && s.f(this.selectedCountry, inputInternationalDbComponent.selectedCountry) && s.f(this.selectedIdType, inputInternationalDbComponent.selectedIdType) && s.f(this.idValue, inputInternationalDbComponent.idValue) && s.f(this.hidden, inputInternationalDbComponent.hidden) && s.f(this.disabled, inputInternationalDbComponent.disabled) && this.hideCountryField == inputInternationalDbComponent.hideCountryField && this.hideIdTypeField == inputInternationalDbComponent.hideIdTypeField && s.f(this.hideCountryIfSingleChoice, inputInternationalDbComponent.hideCountryIfSingleChoice) && s.f(this.hideTypeIfSingleChoice, inputInternationalDbComponent.hideTypeIfSingleChoice) && s.f(this.allowedIdTypes, inputInternationalDbComponent.allowedIdTypes) && s.f(this.inputSelectStyle, inputInternationalDbComponent.inputSelectStyle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c2 getCountrySelectComponent() {
        return this.countrySelectComponent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHideCountryField() {
        return this.hideCountryField;
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
        String str = this.selectedCountry;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedIdType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idValue;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode5 = (iHashCode4 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode6 = (((((iHashCode5 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31) + Boolean.hashCode(this.hideCountryField)) * 31) + Boolean.hashCode(this.hideIdTypeField)) * 31;
        Boolean bool = this.hideCountryIfSingleChoice;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hideTypeIfSingleChoice;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<InputInternationalDb.IdType> list = this.allowedIdTypes;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.inputSelectStyle;
        return iHashCode9 + (inputSelectComponentStyle != null ? inputSelectComponentStyle.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getHideCountryIfSingleChoice() {
        return this.hideCountryIfSingleChoice;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getHideIdTypeField() {
        return this.hideIdTypeField;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getHideTypeIfSingleChoice() {
        return this.hideTypeIfSingleChoice;
    }

    public final List<IdOption> l() {
        Map<String, ? extends List<IdOption>> map = this.typesByCountryCode;
        if (map != null) {
            return map.get(this.selectedCountry);
        }
        return null;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final l getIdTypeOptionsController() {
        return this.idTypeOptionsController;
    }

    public final c2 q() {
        List<IdOption> listL = l();
        if (listL == null) {
            return null;
        }
        return new g(listL);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getIdValue() {
        return this.idValue;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final t getIdValueController() {
        return this.idValueController;
    }

    public String toString() {
        return "InputInternationalDbComponent(name=" + this.name + ", selectedCountry=" + this.selectedCountry + ", selectedIdType=" + this.selectedIdType + ", idValue=" + this.idValue + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", hideCountryField=" + this.hideCountryField + ", hideIdTypeField=" + this.hideIdTypeField + ", hideCountryIfSingleChoice=" + this.hideCountryIfSingleChoice + ", hideTypeIfSingleChoice=" + this.hideTypeIfSingleChoice + ", allowedIdTypes=" + this.allowedIdTypes + ", inputSelectStyle=" + this.inputSelectStyle + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final InputSelectComponentStyle getInputSelectStyle() {
        return this.inputSelectStyle;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getSelectedCountry() {
        return this.selectedCountry;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getSelectedIdType() {
        return this.selectedIdType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.selectedCountry);
        dest.writeString(this.selectedIdType);
        dest.writeString(this.idValue);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeInt(this.hideCountryField ? 1 : 0);
        dest.writeInt(this.hideIdTypeField ? 1 : 0);
        Boolean bool = this.hideCountryIfSingleChoice;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hideTypeIfSingleChoice;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<InputInternationalDb.IdType> list = this.allowedIdTypes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<InputInternationalDb.IdType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeParcelable(this.inputSelectStyle, flags);
    }

    public final InputInternationalDbComponent x(Option selectedCountry) {
        InputInternationalDbComponent inputInternationalDbComponentB = b(this, null, selectedCountry != null ? selectedCountry.getValue() : null, null, null, null, null, false, false, null, null, null, null, 4093, null);
        inputInternationalDbComponentB.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentB.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentB.idValueController = this.idValueController;
        return inputInternationalDbComponentB;
    }

    public final InputInternationalDbComponent y(Option selectedIdType) {
        InputInternationalDbComponent inputInternationalDbComponentB = b(this, null, null, selectedIdType != null ? selectedIdType.getValue() : null, null, null, null, false, false, null, null, null, null, 4091, null);
        inputInternationalDbComponentB.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentB.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentB.idValueController = this.idValueController;
        return inputInternationalDbComponentB;
    }

    public final InputInternationalDbComponent z(String value) {
        InputInternationalDbComponent inputInternationalDbComponentB = b(this, null, null, null, value, null, null, false, false, null, null, null, null, 4087, null);
        inputInternationalDbComponentB.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentB.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentB.idValueController = this.idValueController;
        return inputInternationalDbComponentB;
    }
}
