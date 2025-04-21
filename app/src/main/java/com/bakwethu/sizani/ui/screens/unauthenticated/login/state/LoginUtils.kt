package com.bakwethu.sizani.ui.screens.unauthenticated.login.state

import com.bakwethu.sizani.R
import com.bakwethu.sizani.ui.common.state.ErrorState

val emailOrMobileEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_email_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_password
)