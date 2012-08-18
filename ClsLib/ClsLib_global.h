#ifndef CLSLIB_GLOBAL_H
#define CLSLIB_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(CLSLIB_LIBRARY)
#  define CLSLIBSHARED_EXPORT Q_DECL_EXPORT
#else
#  define CLSLIBSHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // CLSLIB_GLOBAL_H
