package org.example.rules.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.rules.model.Action;
import org.example.rules.model.ActionRef;
import org.example.rules.model.Filter;
import org.example.rules.model.Model;
import org.example.rules.model.ModelPackage;
import org.example.rules.model.Rule;
import org.example.rules.services.RulesGrammarAccess;

@SuppressWarnings("all")
public class RulesFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RulesGrammarAccess _rulesGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Action> _actions = model.getActions();
    for (final Action action : _actions) {
      document.<Action>format(action);
    }
    EList<Rule> _rules = model.getRules();
    for (final Rule rule : _rules) {
      document.<Rule>format(rule);
    }
  }
  
  protected void _format(final Action action, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(action).keyword(this._rulesGrammarAccess.getActionAccess().getActionKeyword_0()), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(action).feature(ModelPackage.Literals.ACTION__NAME), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<Action>append(action, _function_4);
  }
  
  protected void _format(final Rule rule, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(this.textRegionExtensions.regionFor(rule).keyword(this._rulesGrammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()), _function), 
      this.textRegionExtensions.regionFor(rule).keyword(this._rulesGrammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(this.textRegionExtensions.regionFor(rule).keyword(this._rulesGrammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4()), _function_2), 
      document.append(this.textRegionExtensions.regionFor(rule).keyword(this._rulesGrammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()), _function_3), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(this.textRegionExtensions.regionFor(rule).keyword(this._rulesGrammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8()), _function_5), 
      document.append(this.textRegionExtensions.regionFor(rule).keyword(this._rulesGrammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10()), _function_6), _function_7);
    EList<Filter> _filters = rule.getFilters();
    for (final Filter filter : _filters) {
      document.<Filter>format(filter);
    }
    EList<ActionRef> _actions = rule.getActions();
    for (final ActionRef actionRef : _actions) {
      document.<ActionRef>format(actionRef);
    }
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<Rule>append(rule, _function_8);
  }
  
  protected void _format(final Filter filter, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(filter).keyword(this._rulesGrammarAccess.getFilterAccess().getIsKeyword_1()), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<Filter>append(filter, _function_1);
  }
  
  protected void _format(final ActionRef actionRef, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<ActionRef>append(actionRef, _function);
  }
  
  public void format(final Object action, final IFormattableDocument document) {
    if (action instanceof XtextResource) {
      _format((XtextResource)action, document);
      return;
    } else if (action instanceof Action) {
      _format((Action)action, document);
      return;
    } else if (action instanceof ActionRef) {
      _format((ActionRef)action, document);
      return;
    } else if (action instanceof Filter) {
      _format((Filter)action, document);
      return;
    } else if (action instanceof Model) {
      _format((Model)action, document);
      return;
    } else if (action instanceof Rule) {
      _format((Rule)action, document);
      return;
    } else if (action instanceof EObject) {
      _format((EObject)action, document);
      return;
    } else if (action == null) {
      _format((Void)null, document);
      return;
    } else if (action != null) {
      _format(action, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action, document).toString());
    }
  }
}
