package wo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wo0.f, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001Bµ\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001eR \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001c\u0012\u0004\b1\u0010,\u001a\u0004\b-\u0010\u001eR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001c\u0012\u0004\b2\u0010,\u001a\u0004\b#\u0010\u001eR \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u001c\u0012\u0004\b3\u0010,\u001a\u0004\b\u001b\u0010\u001eR0\u0010\u0016\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158\u0006@GX\u0087\u000e¢\u0006\u0018\n\u0004\b.\u00105\u0012\u0004\b9\u0010,\u001a\u0004\b&\u00106\"\u0004\b7\u00108R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010:\u0012\u0004\b<\u0010,\u001a\u0004\b/\u0010;¨\u0006="}, d2 = {"Lwo0/f;", "", "", "encodeDefaults", "ignoreUnknownKeys", "isLenient", "allowStructuredMapKeys", "prettyPrint", "explicitNulls", "", "prettyPrintIndent", "coerceInputValues", "useArrayPolymorphism", "classDiscriminator", "allowSpecialFloatingPointValues", "useAlternativeNames", "Lwo0/y;", "namingStrategy", "decodeEnumsCaseInsensitive", "allowTrailingComma", "allowComments", "Lwo0/a;", "classDiscriminatorMode", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLwo0/y;ZZZLwo0/a;)V", "toString", "()Ljava/lang/String;", "a", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "b", "k", "c", "q", DateTokenConverter.CONVERTER_KEY, "e", "m", "f", "j", "g", "Ljava/lang/String;", "n", "getPrettyPrintIndent$annotations", "()V", "h", "p", "l", "o", "getDecodeEnumsCaseInsensitive$annotations", "getAllowTrailingComma$annotations", "getAllowComments$annotations", "value", "Lwo0/a;", "()Lwo0/a;", "setClassDiscriminatorMode", "(Lwo0/a;)V", "getClassDiscriminatorMode$annotations", "Lwo0/y;", "()Lwo0/y;", "getNamingStrategy$annotations", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean encodeDefaults;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ignoreUnknownKeys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLenient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowStructuredMapKeys;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean prettyPrint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean explicitNulls;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String prettyPrintIndent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean coerceInputValues;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classDiscriminator;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowSpecialFloatingPointValues;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useAlternativeNames;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean decodeEnumsCaseInsensitive;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowTrailingComma;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowComments;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private a classDiscriminatorMode;

    public JsonConfiguration() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowComments() {
        return this.allowComments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAllowTrailingComma() {
        return this.allowTrailingComma;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.decodeEnumsCaseInsensitive;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    public final y l() {
        return null;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsLenient() {
        return this.isLenient;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.encodeDefaults + ", ignoreUnknownKeys=" + this.ignoreUnknownKeys + ", isLenient=" + this.isLenient + ", allowStructuredMapKeys=" + this.allowStructuredMapKeys + ", prettyPrint=" + this.prettyPrint + ", explicitNulls=" + this.explicitNulls + ", prettyPrintIndent='" + this.prettyPrintIndent + "', coerceInputValues=" + this.coerceInputValues + ", useArrayPolymorphism=" + this.useArrayPolymorphism + ", classDiscriminator='" + this.classDiscriminator + "', allowSpecialFloatingPointValues=" + this.allowSpecialFloatingPointValues + ", useAlternativeNames=" + this.useAlternativeNames + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.decodeEnumsCaseInsensitive + ", allowTrailingComma=" + this.allowTrailingComma + ", allowComments=" + this.allowComments + ", classDiscriminatorMode=" + this.classDiscriminatorMode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public JsonConfiguration(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String prettyPrintIndent, boolean z17, boolean z18, String classDiscriminator, boolean z19, boolean z21, y yVar, boolean z22, boolean z23, boolean z24, a classDiscriminatorMode) {
        p013kotlin.jvm.internal.s.k(prettyPrintIndent, "prettyPrintIndent");
        p013kotlin.jvm.internal.s.k(classDiscriminator, "classDiscriminator");
        p013kotlin.jvm.internal.s.k(classDiscriminatorMode, "classDiscriminatorMode");
        this.encodeDefaults = z11;
        this.ignoreUnknownKeys = z12;
        this.isLenient = z13;
        this.allowStructuredMapKeys = z14;
        this.prettyPrint = z15;
        this.explicitNulls = z16;
        this.prettyPrintIndent = prettyPrintIndent;
        this.coerceInputValues = z17;
        this.useArrayPolymorphism = z18;
        this.classDiscriminator = classDiscriminator;
        this.allowSpecialFloatingPointValues = z19;
        this.useAlternativeNames = z21;
        this.decodeEnumsCaseInsensitive = z22;
        this.allowTrailingComma = z23;
        this.allowComments = z24;
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    public /* synthetic */ JsonConfiguration(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, boolean z17, boolean z18, String str2, boolean z19, boolean z21, y yVar, boolean z22, boolean z23, boolean z24, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? true : z16, (i11 & 64) != 0 ? "    " : str, (i11 & 128) != 0 ? false : z17, (i11 & 256) != 0 ? false : z18, (i11 & 512) != 0 ? "type" : str2, (i11 & 1024) != 0 ? false : z19, (i11 & 2048) == 0 ? z21 : true, (i11 & 4096) != 0 ? null : yVar, (i11 & PKIFailureInfo.certRevoked) != 0 ? false : z22, (i11 & 16384) != 0 ? false : z23, (i11 & 32768) != 0 ? false : z24, (i11 & 65536) != 0 ? a.POLYMORPHIC : aVar);
    }
}
