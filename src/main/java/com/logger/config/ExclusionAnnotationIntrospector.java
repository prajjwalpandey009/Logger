package com.logger.config;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.logger.aspects.IgnoreFieldForLogger;

public class ExclusionAnnotationIntrospector extends JacksonAnnotationIntrospector {

  @Override
  protected boolean _isIgnorable(Annotated a) {
    if (a.hasAnnotation(IgnoreFieldForLogger.class)) {
      return true;
    }
    return super._isIgnorable(a);
  }
}
