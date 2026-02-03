import React from 'react';

type CalculatorButtonProps = {
    label: string;
    onClick: (value: string) => void;
    className?: string;
    disabled?: boolean;
};

const CalculatorButton: React.FC<CalculatorButtonProps> = ({
    label,
    onClick,
    className = '',
    disabled = false,
}) => {
    return (
        <button
            className={`calculator-button ${className}`}
            onClick={() => onClick(label)}
            disabled={disabled}
            type="button"
        >
            {label}
        </button>
    );
};

export default CalculatorButton;