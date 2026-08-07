package com.fourthline.scanners.config;

import com.fourthline.orca.core.flavor.OrcaLocalization;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u000b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig;", "", "displayName", "", "languageCode", "Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "<init>", "(Ljava/lang/String;Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;)V", "getDisplayName", "()Ljava/lang/String;", "getLanguageCode", "()Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "English", "Dutch", "Spanish", "Finnish", "French", "Italian", "German", "Greek", "Polish", "Portuguese", "Romanian", "Lcom/fourthline/scanners/config/LanguageConfig$Dutch;", "Lcom/fourthline/scanners/config/LanguageConfig$English;", "Lcom/fourthline/scanners/config/LanguageConfig$Finnish;", "Lcom/fourthline/scanners/config/LanguageConfig$French;", "Lcom/fourthline/scanners/config/LanguageConfig$German;", "Lcom/fourthline/scanners/config/LanguageConfig$Greek;", "Lcom/fourthline/scanners/config/LanguageConfig$Italian;", "Lcom/fourthline/scanners/config/LanguageConfig$Polish;", "Lcom/fourthline/scanners/config/LanguageConfig$Portuguese;", "Lcom/fourthline/scanners/config/LanguageConfig$Romanian;", "Lcom/fourthline/scanners/config/LanguageConfig$Spanish;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LanguageConfig {
    private final String displayName;
    private final OrcaLocalization.LanguageType languageCode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Dutch;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dutch extends LanguageConfig {
        public static final Dutch INSTANCE = new Dutch();

        private Dutch() {
            super("Dutch", OrcaLocalization.LanguageType.NL, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$English;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class English extends LanguageConfig {
        public static final English INSTANCE = new English();

        private English() {
            super("English", OrcaLocalization.LanguageType.EN, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Finnish;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Finnish extends LanguageConfig {
        public static final Finnish INSTANCE = new Finnish();

        private Finnish() {
            super("Finnish", OrcaLocalization.LanguageType.FI, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$French;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class French extends LanguageConfig {
        public static final French INSTANCE = new French();

        private French() {
            super("French", OrcaLocalization.LanguageType.FR, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$German;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class German extends LanguageConfig {
        public static final German INSTANCE = new German();

        private German() {
            super("German", OrcaLocalization.LanguageType.DE, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Greek;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Greek extends LanguageConfig {
        public static final Greek INSTANCE = new Greek();

        private Greek() {
            super("Greek", OrcaLocalization.LanguageType.EL, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Italian;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Italian extends LanguageConfig {
        public static final Italian INSTANCE = new Italian();

        private Italian() {
            super("Italian", OrcaLocalization.LanguageType.IT, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Polish;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Polish extends LanguageConfig {
        public static final Polish INSTANCE = new Polish();

        private Polish() {
            super("Polish", OrcaLocalization.LanguageType.PL, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Portuguese;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Portuguese extends LanguageConfig {
        public static final Portuguese INSTANCE = new Portuguese();

        private Portuguese() {
            super("Portuguese", OrcaLocalization.LanguageType.PT, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Romanian;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Romanian extends LanguageConfig {
        public static final Romanian INSTANCE = new Romanian();

        private Romanian() {
            super("Romanian", OrcaLocalization.LanguageType.RO, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/LanguageConfig$Spanish;", "Lcom/fourthline/scanners/config/LanguageConfig;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Spanish extends LanguageConfig {
        public static final Spanish INSTANCE = new Spanish();

        private Spanish() {
            super("Spanish", OrcaLocalization.LanguageType.ES, null);
        }
    }

    public /* synthetic */ LanguageConfig(String str, OrcaLocalization.LanguageType languageType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, languageType);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final OrcaLocalization.LanguageType getLanguageCode() {
        return this.languageCode;
    }

    private LanguageConfig(String str, OrcaLocalization.LanguageType languageType) {
        this.displayName = str;
        this.languageCode = languageType;
    }
}
