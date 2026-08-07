package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Tokenizer {
    final String pattern;
    final int patternLength;
    TokenizerState state = TokenizerState.LITERAL_STATE;
    int pointer = 0;

    /* JADX INFO: renamed from: ch.qos.logback.core.subst.Tokenizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum TokenizerState {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb2) {
        if (sb2.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb2.toString()));
    }

    private void handleDefaultValueState(char c11, List<Token> list, StringBuilder sb2) {
        TokenizerState tokenizerState;
        Token token;
        if (c11 != '$') {
            if (c11 != '-') {
                sb2.append(CoreConstants.COLON_CHAR);
                if (c11 != '{') {
                    sb2.append(c11);
                } else {
                    addLiteralToken(list, sb2);
                    sb2.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
                tokenizerState = TokenizerState.LITERAL_STATE;
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            tokenizerState = TokenizerState.LITERAL_STATE;
        } else {
            sb2.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c11, List<Token> list, StringBuilder sb2) {
        if (c11 == '$') {
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            this.state = TokenizerState.START_STATE;
            return;
        }
        if (c11 == ':') {
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            this.state = TokenizerState.DEFAULT_VAL_STATE;
        } else if (c11 == '{') {
            addLiteralToken(list, sb2);
            list.add(Token.CURLY_LEFT_TOKEN);
            sb2.setLength(0);
        } else {
            if (c11 != '}') {
                sb2.append(c11);
                return;
            }
            addLiteralToken(list, sb2);
            list.add(Token.CURLY_RIGHT_TOKEN);
            sb2.setLength(0);
        }
    }

    private void handleStartState(char c11, List<Token> list, StringBuilder sb2) {
        if (c11 == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb2.append(CoreConstants.DOLLAR);
            sb2.append(c11);
        }
        this.state = TokenizerState.LITERAL_STATE;
    }

    List<Token> tokenize() {
        char c11;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i11 = this.pointer;
            if (i11 >= this.patternLength) {
                break;
            }
            char cCharAt = this.pattern.charAt(i11);
            this.pointer++;
            int i12 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
            if (i12 == 1) {
                handleLiteralState(cCharAt, arrayList, sb2);
            } else if (i12 == 2) {
                handleStartState(cCharAt, arrayList, sb2);
            } else if (i12 == 3) {
                handleDefaultValueState(cCharAt, arrayList, sb2);
            }
        }
        int i13 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
        if (i13 == 1) {
            addLiteralToken(arrayList, sb2);
            return arrayList;
        }
        if (i13 == 2) {
            c11 = CoreConstants.DOLLAR;
        } else {
            if (i13 != 3) {
                return arrayList;
            }
            c11 = CoreConstants.COLON_CHAR;
        }
        sb2.append(c11);
        addLiteralToken(arrayList, sb2);
        return arrayList;
    }
}
