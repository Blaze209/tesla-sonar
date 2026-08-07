package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes4.dex */
class l extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f23836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EventDispatcher f23837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f23839d;

    public l(InputConnection inputConnection, ReactContext reactContext, j jVar, EventDispatcher eventDispatcher) {
        super(inputConnection, false);
        this.f23839d = null;
        this.f23837b = eventDispatcher;
        this.f23836a = jVar;
    }

    private void b(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f23837b.h(new q(this.f23836a.getId(), str));
    }

    private void c(String str) {
        if (this.f23838c) {
            this.f23839d = str;
        } else {
            b(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f23838c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i11) {
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.equals("")) {
                string = "Backspace";
            }
            c(string);
        }
        return super.commitText(charSequence, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        b("Backspace");
        return super.deleteSurroundingText(i11, i12);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f23838c = false;
        String str = this.f23839d;
        if (str != null) {
            b(str);
            this.f23839d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z11 = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                b("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                b("Enter");
            } else if (z11) {
                b(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i11) {
        int selectionStart = this.f23836a.getSelectionStart();
        int selectionEnd = this.f23836a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i11);
        int selectionStart2 = this.f23836a.getSelectionStart();
        c((selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.f23836a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
