package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.u;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import oi0.MaskTextInputState;
import oi0.Option;
import oi0.o1;
import oi0.p5;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import ri0.p;
import ui0.e0;
import ui0.o;
import ui0.z;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u0019\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$c;", "Loi0/e4;", "l", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$c;)Loi0/e4;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$e;", "m", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/b$e;)Loi0/e4;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "j", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lri0/p;", "binding", "Lkotlin/Function0;", "Ljn0/h0;", "onCountryInputClick", "onIdTypeInputClick", "", "countryError", "idTypeError", "valueError", "n", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;Lri0/p;Lwn0/a;Lwn0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final ConstraintLayout j(InputInternationalDbComponent inputInternationalDbComponent, p5 uiComponentHelper, final InputInternationalDb config) {
        s.k(inputInternationalDbComponent, "<this>");
        s.k(uiComponentHelper, "uiComponentHelper");
        s.k(config, "config");
        final p pVarC = p.c(uiComponentHelper.getLayoutInflater());
        InputInternationalDb.Attributes attributes = config.getAttributes();
        pVarC.f108380h.setText(attributes != null ? attributes.getLabel() : null);
        pVarC.f108375c.setHint(attributes != null ? attributes.getLabelIdbCountry() : null);
        pVarC.f108378f.setHint(attributes != null ? attributes.getLabelIdbType() : null);
        pVarC.f108381i.setHint(attributes != null ? attributes.getLabelIdbValue() : null);
        EditText editText = pVarC.f108381i.getEditText();
        if (editText != null) {
            u.b(inputInternationalDbComponent.getIdValueController(), editText);
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.f1
            @Override // wn0.a
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.steps.ui.components.c.k(config, pVarC);
            }
        });
        pVarC.getRoot().setTag(pVarC);
        ConstraintLayout root = pVarC.getRoot();
        s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(InputInternationalDb inputInternationalDb, p pVar) {
        InputInternationalDb.InputInternationalDbComponentStyle styles = inputInternationalDb.getStyles();
        if (styles != null) {
            InputSelectComponentStyle inputSelectStyle = styles.getInputSelectStyle();
            if (inputSelectStyle != null) {
                TextInputLayout idbCountryInput = pVar.f108375c;
                s.j(idbCountryInput, "idbCountryInput");
                o.i(idbCountryInput, inputSelectStyle);
                TextInputLayout idbIdTypeInput = pVar.f108378f;
                s.j(idbIdTypeInput, "idbIdTypeInput");
                o.i(idbIdTypeInput, inputSelectStyle);
            }
            InputTextBasedComponentStyle inputTextStyle = styles.getInputTextStyle();
            if (inputTextStyle != null) {
                TextInputLayout idbValueInput = pVar.f108381i;
                s.j(idbValueInput, "idbValueInput");
                z.k(idbValueInput, inputTextStyle);
            }
            TextBasedComponentStyle textStyle = styles.getTextStyle();
            if (textStyle != null) {
                TextView idbDescription = pVar.f108377e;
                s.j(idbDescription, "idbDescription");
                e0.n(idbDescription, textStyle, null, 2, null);
            }
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Option l(InputInternationalDbComponent.CountryOption countryOption) {
        return new Option(countryOption.getCountryName(), countryOption.getCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Option m(InputInternationalDbComponent.IdOption idOption) {
        return new Option(idOption.getName(), idOption.getIdType());
    }

    public static final void n(InputInternationalDbComponent inputInternationalDbComponent, p binding, final wn0.a<h0> onCountryInputClick, final wn0.a<h0> onIdTypeInputClick, String str, String str2, String str3) {
        InputInternationalDb.IdType idType;
        Object next;
        s.k(inputInternationalDbComponent, "<this>");
        s.k(binding, "binding");
        s.k(onCountryInputClick, "onCountryInputClick");
        s.k(onIdTypeInputClick, "onIdTypeInputClick");
        EditText editText = binding.f108375c.getEditText();
        if (editText != null) {
            editText.setText(v.y0(inputInternationalDbComponent.getCountryOptionsController().b(), "\n", null, null, 0, null, new l() { // from class: oi0.g1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.steps.ui.components.c.s((Option) obj);
                }
            }, 30, null));
        }
        EditText editText2 = binding.f108378f.getEditText();
        if (editText2 != null) {
            editText2.setText(v.y0(inputInternationalDbComponent.getIdTypeOptionsController().b(), "\n", null, null, 0, null, new l() { // from class: oi0.h1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.steps.ui.components.c.t((Option) obj);
                }
            }, 30, null));
        }
        String selectedCountry = inputInternationalDbComponent.getSelectedCountry();
        String selectedIdType = inputInternationalDbComponent.getSelectedIdType();
        List<InputInternationalDbComponent.CountryOption> listD = inputInternationalDbComponent.d();
        List<InputInternationalDbComponent.IdOption> listL = inputInternationalDbComponent.l();
        boolean hideCountryField = inputInternationalDbComponent.getHideCountryField();
        boolean hideIdTypeField = inputInternationalDbComponent.getHideIdTypeField();
        if (selectedCountry == null) {
            binding.f108378f.setEnabled(false);
        } else {
            binding.f108378f.setEnabled(true);
        }
        if (selectedCountry == null && listD != null && listD.size() == 1) {
            inputInternationalDbComponent.getCountryOptionsController().c(v.e(l((InputInternationalDbComponent.CountryOption) v.o0(listD))));
            if (s.f(inputInternationalDbComponent.getHideCountryIfSingleChoice(), Boolean.TRUE)) {
                hideCountryField = true;
            }
        }
        if (selectedCountry != null && listL != null && listL.size() == 1) {
            inputInternationalDbComponent.getIdTypeOptionsController().c(v.e(m((InputInternationalDbComponent.IdOption) v.o0(listL))));
            if (s.f(inputInternationalDbComponent.getHideTypeIfSingleChoice(), Boolean.TRUE)) {
                hideIdTypeField = true;
            }
        }
        binding.f108375c.setVisibility(hideCountryField ? 8 : 0);
        binding.f108378f.setVisibility(hideIdTypeField ? 8 : 0);
        if (selectedCountry == null || selectedIdType == null) {
            binding.f108381i.setEnabled(false);
            binding.f108377e.setVisibility(8);
        } else {
            binding.f108381i.setEnabled(true);
            List<InputInternationalDb.IdType> listC = inputInternationalDbComponent.c();
            if (listC != null) {
                Iterator<T> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InputInternationalDb.IdType idType2 = (InputInternationalDb.IdType) next;
                    if (s.f(idType2.getCountryCode(), selectedCountry) && s.f(idType2.getIdType(), selectedIdType)) {
                        break;
                    }
                }
                idType = (InputInternationalDb.IdType) next;
            } else {
                idType = null;
            }
            TextInputLayout idbValueInput = binding.f108381i;
            s.j(idbValueInput, "idbValueInput");
            o1.d(idbValueInput, new MaskTextInputState(null, idType != null ? idType.getMask() : null, idType != null ? idType.getSecure() : null, null, idType != null ? idType.getPlaceholder() : null));
            String description = idType != null ? idType.getDescription() : null;
            if (description == null || t.y0(description)) {
                binding.f108377e.setVisibility(8);
            } else {
                binding.f108377e.setVisibility(0);
                binding.f108377e.setText(idType != null ? idType.getDescription() : null);
            }
        }
        binding.f108375c.setOnClickListener(new View.OnClickListener() { // from class: oi0.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.steps.ui.components.c.o(onCountryInputClick, view);
            }
        });
        EditText editText3 = binding.f108375c.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: oi0.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.steps.ui.components.c.p(onCountryInputClick, view);
                }
            });
        }
        binding.f108378f.setOnClickListener(new View.OnClickListener() { // from class: oi0.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.steps.ui.components.c.q(onIdTypeInputClick, view);
            }
        });
        EditText editText4 = binding.f108378f.getEditText();
        if (editText4 != null) {
            editText4.setOnClickListener(new View.OnClickListener() { // from class: oi0.l1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.steps.ui.components.c.r(onIdTypeInputClick, view);
                }
            });
        }
        binding.f108375c.setError(str);
        binding.f108378f.setError(str2);
        binding.f108381i.setError(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(wn0.a aVar, View view) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(wn0.a aVar, View view) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(wn0.a aVar, View view) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(wn0.a aVar, View view) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence s(Option it) {
        s.k(it, "it");
        return it.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence t(Option it) {
        s.k(it, "it");
        return it.getText();
    }
}
