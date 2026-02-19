import React from 'react';
import { type LucideIcon } from 'lucide-react';

// 1. Define the Props interface
interface CalcButtonProps {
  label?: string;
  // Lucide icons are passed as components, so we use LucideIcon type
  icon?: LucideIcon; 
  onClick: () => void;
  className?: string;
  // Restrict variant to specific allowed strings
  variant?: 'number' | 'operator' | 'function';
}

const CalcButton: React.FC<CalcButtonProps> = ({ 
  label, 
  icon: Icon, 
  onClick, 
  className = "", 
  variant = "number" 
}) => {
  
  const baseStyles = "flex items-center justify-center h-16 rounded-2xl text-xl font-semibold transition-all active:scale-90 select-none shadow-sm";
  
  // Record type maps the variant keys to their CSS string values
  const variants: Record<string, string> = {
    number: "bg-gray-800 text-white hover:bg-gray-700",
    operator: "bg-orange-500 text-white hover:bg-orange-400",
    function: "bg-gray-300 text-black hover:bg-gray-200",
  };

  return (
    <button 
      onClick={onClick}
      className={`${baseStyles} ${variants[variant]} ${className}`}
      type="button"
    >
      {Icon ? <Icon size={24} strokeWidth={2.5} /> : label}
    </button>
  );
};

export default CalcButton;