package wo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR(\u0010'\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b(\u0010\f\"\u0004\b\u0018\u0010\u000eR\"\u0010+\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b*\u0010\"\"\u0004\b\u0014\u0010$R(\u00103\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010-\u0012\u0004\b2\u0010&\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR(\u0010:\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u0010\n\u0012\u0004\b9\u0010&\u001a\u0004\b8\u0010\f\"\u0004\b\u001b\u0010\u000eR(\u0010?\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010\n\u0012\u0004\b>\u0010&\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR(\u0010D\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u0010\n\u0012\u0004\bC\u0010&\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000eR\"\u0010H\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR\"\u0010L\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR\"\u0010P\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\"\u0010W\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\b\u0010\u0010T\"\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lwo0/d;", "", "Lwo0/b;", "json", "<init>", "(Lwo0/b;)V", "Lwo0/f;", "a", "()Lwo0/f;", "", "Z", "getEncodeDefaults", "()Z", "f", "(Z)V", "encodeDefaults", "b", "getExplicitNulls", "g", "explicitNulls", "c", "getIgnoreUnknownKeys", "h", "ignoreUnknownKeys", DateTokenConverter.CONVERTER_KEY, "isLenient", IntegerTokenConverter.CONVERTER_KEY, "e", "getPrettyPrint", "j", "prettyPrint", "", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "()V", "prettyPrintIndent", "getCoerceInputValues", "coerceInputValues", "getClassDiscriminator", "classDiscriminator", "Lwo0/a;", "Lwo0/a;", "getClassDiscriminatorMode", "()Lwo0/a;", "setClassDiscriminatorMode", "(Lwo0/a;)V", "getClassDiscriminatorMode$annotations", "classDiscriminatorMode", "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "k", "getDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "decodeEnumsCaseInsensitive", "l", "getAllowTrailingComma", "setAllowTrailingComma", "getAllowTrailingComma$annotations", "allowTrailingComma", "m", "getAllowComments", "setAllowComments", "getAllowComments$annotations", "allowComments", "n", "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", "o", "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "allowStructuredMapKeys", "p", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "useArrayPolymorphism", "Lyo0/c;", "q", "Lyo0/c;", "()Lyo0/c;", "setSerializersModule", "(Lyo0/c;)V", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean encodeDefaults;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean explicitNulls;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreUnknownKeys;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isLenient;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean prettyPrint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String prettyPrintIndent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean coerceInputValues;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String classDiscriminator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private a classDiscriminatorMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean useAlternativeNames;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean decodeEnumsCaseInsensitive;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean allowTrailingComma;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean allowComments;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean allowSpecialFloatingPointValues;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean allowStructuredMapKeys;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private yo0.c serializersModule;

    public d(b json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().getIsLenient();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        json.getConfiguration().l();
        this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
        this.allowComments = json.getConfiguration().getAllowComments();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.serializersModule = json.getSerializersModule();
    }

    public final JsonConfiguration a() {
        if (this.useArrayPolymorphism) {
            if (!p013kotlin.jvm.internal.s.f(this.classDiscriminator, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.classDiscriminatorMode != a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.prettyPrint) {
            if (!p013kotlin.jvm.internal.s.f(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent).toString());
                    }
                }
            }
        } else if (!p013kotlin.jvm.internal.s.f(this.prettyPrintIndent, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, null, this.decodeEnumsCaseInsensitive, this.allowTrailingComma, this.allowComments, this.classDiscriminatorMode);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final yo0.c getSerializersModule() {
        return this.serializersModule;
    }

    public final void c(String str) {
        p013kotlin.jvm.internal.s.k(str, "<set-?>");
        this.classDiscriminator = str;
    }

    public final void d(boolean z11) {
        this.coerceInputValues = z11;
    }

    public final void e(boolean z11) {
        this.decodeEnumsCaseInsensitive = z11;
    }

    public final void f(boolean z11) {
        this.encodeDefaults = z11;
    }

    public final void g(boolean z11) {
        this.explicitNulls = z11;
    }

    public final void h(boolean z11) {
        this.ignoreUnknownKeys = z11;
    }

    public final void i(boolean z11) {
        this.isLenient = z11;
    }

    public final void j(boolean z11) {
        this.prettyPrint = z11;
    }
}
