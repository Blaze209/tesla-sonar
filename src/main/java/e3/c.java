package e3;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Le3/c;", "Le3/g;", "Landroid/view/View;", "view", "Le3/l;", "autofillTree", "<init>", "(Landroid/view/View;Le3/l;)V", "Le3/k;", "autofillNode", "Ljn0/h0;", "b", "(Le3/k;)V", "a", "Landroid/view/View;", "e", "()Landroid/view/View;", "Le3/l;", DateTokenConverter.CONVERTER_KEY, "()Le3/l;", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l autofillTree;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AutofillManager autofillManager;

    public c(View view, l lVar) {
        this.view = view;
        this.autofillTree = lVar;
        AutofillManager autofillManagerA = b.a(view.getContext().getSystemService(a.a()));
        if (autofillManagerA == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = autofillManagerA;
        view.setImportantForAutofill(1);
    }

    @Override // e3.g
    public void a(k autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    @Override // e3.g
    public void b(k autofillNode) {
        j3.i boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new Rect(Math.round(boundingBox.getLeft()), Math.round(boundingBox.getTop()), Math.round(boundingBox.getRight()), Math.round(boundingBox.getBottom())));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l getAutofillTree() {
        return this.autofillTree;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
