package sg0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pg0.IdConfig;

/* JADX INFO: renamed from: sg0.h, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Lsg0/h;", "", "", "helpButtonText", "title", "prompt", "tips", "buttonText", "Lpg0/d4$e;", "side", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg0/d4$e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lpg0/d4$e;", "()Lpg0/d4$e;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CaptureTipsViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String helpButtonText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String prompt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tips;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdConfig.e side;

    public CaptureTipsViewModel(String helpButtonText, String title, String prompt, String tips, String buttonText, IdConfig.e side) {
        s.k(helpButtonText, "helpButtonText");
        s.k(title, "title");
        s.k(prompt, "prompt");
        s.k(tips, "tips");
        s.k(buttonText, "buttonText");
        s.k(side, "side");
        this.helpButtonText = helpButtonText;
        this.title = title;
        this.prompt = prompt;
        this.tips = tips;
        this.buttonText = buttonText;
        this.side = side;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHelpButtonText() {
        return this.helpButtonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final IdConfig.e getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureTipsViewModel)) {
            return false;
        }
        CaptureTipsViewModel captureTipsViewModel = (CaptureTipsViewModel) other;
        return s.f(this.helpButtonText, captureTipsViewModel.helpButtonText) && s.f(this.title, captureTipsViewModel.title) && s.f(this.prompt, captureTipsViewModel.prompt) && s.f(this.tips, captureTipsViewModel.tips) && s.f(this.buttonText, captureTipsViewModel.buttonText) && this.side == captureTipsViewModel.side;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.helpButtonText.hashCode() * 31) + this.title.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.tips.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.side.hashCode();
    }

    public String toString() {
        return "CaptureTipsViewModel(helpButtonText=" + this.helpButtonText + ", title=" + this.title + ", prompt=" + this.prompt + ", tips=" + this.tips + ", buttonText=" + this.buttonText + ", side=" + this.side + ")";
    }
}
