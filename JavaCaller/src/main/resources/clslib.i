%module javacall

%ignore CLSLIBSHARED_EXPORT;
%ignore Q_DECL_IMPORT;
%ignore Q_DECL_EXPORT;

%{
#include "../../../../ClsLib/clslib.h"
%}

%include <windows.i>
%include "../../../../ClsLib/clslib.h"